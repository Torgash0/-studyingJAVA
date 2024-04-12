package Hibenate.Networking;

import  java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class SocletServer {
    public static void main(String[] args) throws IOException {
        try (var serverSocket = new ServerSocket(8080);
             var socket = serverSocket.accept();
             var inputStream = new DataInputStream(socket.getInputStream());
             var outputStream = new DataOutputStream(socket.getOutputStream());
             var scaner = new Scanner(System.in);) {
            var requesr = inputStream.readUTF();
            while (!requesr.equals("exit")) {
                 System.out.println("клиент: " + requesr);
                outputStream.writeUTF(scaner.nextLine());
                requesr = inputStream.readUTF();
            }
        }
    }
}