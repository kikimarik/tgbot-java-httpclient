package components.http;

import com.github.mizosoft.methanol.MultipartBodyPublisher;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public class SimpleHttpClient implements HttpClientInterface {

    private final HttpResponseInterface response;
    private String method;
    private String url;
    private String body = "";
    private HashMap<String, Object> bodyMap;
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
    public HttpClientInterface setBodyMap(HashMap<String, Object> bodyMap) {
        this.bodyMap = bodyMap;
        return this;
    }

    @Override
    public boolean validate() {
        return true; // TODO add validation
    }

    @Override
    public HttpResponseInterface getResponse() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest.BodyPublisher publisher;
        String boundary;
        if (this.contentType.equals(HttpClientInterface.TYPE_FORM_DATA)) {
            MultipartBodyPublisher.Builder builder = MultipartBodyPublisher.newBuilder();
            for (Map.Entry<String, Object> entry:
                    this.bodyMap.entrySet()){
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof LinkedHashMap) {
                    builder.filePart(key, Path.of((String) ((LinkedHashMap<?, ?>) value).get("path")));
                } else {
                    builder.textPart(key, value);
                }
            }
            boundary = "--" + UUID.randomUUID() + "--";
            builder.boundary(boundary);
            this.contentType += "; boundary=" + boundary;
            publisher = builder.build();
        } else  {
            publisher = HttpRequest.BodyPublishers.ofString(this.body);
        }
        HttpRequest request = HttpRequest.newBuilder()
                .header("Content-Type", this.contentType)
                .method(this.method, publisher)
                .uri(URI.create(this.url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        this.response.load(response.statusCode(), response.body(), response.headers());

        return this.response;
    }
}
