package Hibenate.Networking.Http;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.util.concurrent.ExecutionException;

import static java.net.http.HttpRequest.BodyPublishers.ofFile;

public class HttpClientRunner {
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        var httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_1_1).build();
        var reqvest=  HttpRequest.newBuilder()
                .uri(URI.create("http://LocalHost:8080"))
                .header("content-type","application/json")
                .POST(ofFile(Path.of("")))
                .build();
        var response = httpClient.sendAsync( reqvest, HttpResponse.BodyHandlers.ofString());
        var response1 = httpClient.sendAsync( reqvest, HttpResponse.BodyHandlers.ofString());
        var response2 = httpClient.sendAsync( reqvest, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.get().headers());

    }
}
