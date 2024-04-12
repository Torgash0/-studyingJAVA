package Hibenate.Networking.Http;

import java.io.IOException;

public class HttpServerRunner {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer =  new HttpServer(8080, 100);
        httpServer.run();
    }
}
