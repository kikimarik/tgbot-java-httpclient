package base;

import java.net.http.HttpHeaders;

public class SimpleHttpResponse implements HttpResponseInterface{
    private int statusCode;
    private String body;

    public SimpleHttpResponse() {
    }

    @Override
    public int getStatusCode() {
        return this.statusCode;
    }

    @Override
    public String[] getErrors() {
        return new String[0]; // TODO implement
    }

    @Override
    public String getBody() {
        return this.body;
    }

    @Override
    public void load(int statusCode, String body, HttpHeaders headers) {
        this.statusCode = statusCode;
        this.body = body;
        // TODO setup headers
    }
}
