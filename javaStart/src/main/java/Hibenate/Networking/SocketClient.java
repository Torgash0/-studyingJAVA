package Hibenate.Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
    public static void main(String[] args) throws IOException {
        try(var socket =  new Socket("localhost",8080);
            var inputStream = new DataInputStream(socket.getInputStream());
            var outputStream = new DataOutputStream(socket.getOutputStream());
            var scaner = new Scanner(System.in)) {
                while (scaner.hasNext()){
                    outputStream.writeUTF(scaner.nextLine());
                    System.out.println("Сервер " + inputStream.readUTF());
                }




        }
    }
}




