package components.http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SimpleHttpClient implements HttpClientInterface {

    private final HttpResponseInterface response;
    private String method;
    private String url;
    private String body = "";
    private String contentType = HttpClientInterface.TYPE_JSON;

    public SimpleHttpClient(HttpResponseInterface response) {
        this.response = response;
    }

    @Override
    public HttpClientInterface setContentType(String type) {
        this.contentType = type;
        return this;
    }

    @Override
    public HttpClientInterface setMethod(String method) {
        this.method = method;
        return this;
    }

    @Override
    public HttpClientInterface setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public HttpClientInterface setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public boolean validate() {
        return true; // TODO add validation
    }

    @Override
    public HttpResponseInterface getResponse() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .header("Content-Type", this.contentType)
                .method(this.method, HttpRequest.BodyPublishers.ofString(this.body))
                .uri(URI.create(this.url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        this.response.load(response.statusCode(), response.body(), response.headers());

        return this.response;
    }
}
