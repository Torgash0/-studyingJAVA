package Hibenate.Networking.Http;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServer {
    private final int port;
    private final ExecutorService executorService;


    public HttpServer(int port, int pollSize) {
        this.port = port;
        executorService = Executors.newFixedThreadPool(pollSize);
    }
    public void run() throws IOException {
        ServerSocket serverSocket =  new ServerSocket(port);
        while (true) {
            var socket = serverSocket.accept();
            System.out.println("Socket accepted");
            executorService.submit(() -> {
                try {
                    proccesSocket(socket);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

    }

    private void proccesSocket(Socket socket) throws IOException, InterruptedException {
        try (socket;
             var inputStream = new DataInputStream(socket.getInputStream());
             var outputStream = new DataOutputStream(socket.getOutputStream());){
             Thread.sleep(1000);
             System.out.println(new String(inputStream.readNBytes(400)));
             byte[] body =  Files.readAllBytes(Path.of(" "));
             outputStream.write("""
                     HTTP/1.1.200 OK
                     content-type: text/html
                     content-lenght: %s 
                     """.formatted(body.length).getBytes());
             outputStream.write(System.lineSeparator().getBytes());
             outputStream.write(body);


        }
    }
}
