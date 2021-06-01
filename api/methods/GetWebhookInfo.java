package api.methods;

import api.ApiMethodInterface;

import java.io.IOException;

public class GetWebhookInfo implements ApiMethodInterface {

    private final String httpMethod;

    public GetWebhookInfo(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Override
    public String send(String token) throws IOException, InterruptedException {
        return this.serviceLocator.getClient()
                .setMethod("GET")
                .setUrl(this.httpRoot + token + httpMethod)
                .getResponse()
                .getBody();
    }
}
