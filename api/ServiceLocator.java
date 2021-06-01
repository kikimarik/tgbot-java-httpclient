package api;

import components.http.HttpClientInterface;
import components.http.HttpResponseInterface;
import components.http.SimpleHttpClient;
import components.http.SimpleHttpResponse;

public class ServiceLocator {
    private static ServiceLocator instance;
    private final HttpResponseInterface response = new SimpleHttpResponse();
    private final HttpClientInterface client = new SimpleHttpClient(this.getResponse());

    private ServiceLocator() {
    }

    public static ServiceLocator getInstance() {
        if (ServiceLocator.instance == null) {
            ServiceLocator.instance = new ServiceLocator();
        }
        return ServiceLocator.instance;
    }

    public HttpClientInterface getClient() {
        return client;
    }

    public HttpResponseInterface getResponse() {
        return response;
    }
}
