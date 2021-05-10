package base;

public class ServiceLocator {
    private final HttpResponseInterface response = new SimpleHttpResponse();
    private final HttpClientInterface client = new SimpleHttpClient(this.getResponse());

    public HttpClientInterface getClient() {
        return client;
    }

    public HttpResponseInterface getResponse() {
        return response;
    }
}
