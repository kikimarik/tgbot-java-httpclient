package api.methods;

import api.ApiMethodWithParamsInterface;

import java.io.IOException;

public class SetWebhook implements ApiMethodWithParamsInterface {

    private final String httpMethod;
    private String queryString = "";

    public SetWebhook(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Override
    public String send(String token) throws IOException, InterruptedException {
        return this.serviceLocator.getClient()
                .setMethod("GET")
                .setUrl(this.httpRoot + token + this.httpMethod + this.queryString)
                .getResponse()
                .getBody();
    }

    @Override
    public void setQueryParams(String[] params) {
        // TODO change to Map
        char separator = '?';
        StringBuilder buffer = new StringBuilder();
        for (String param:
             params) {
            buffer.append(separator).append(param);
            separator = '&';
        }
        this.queryString = buffer.toString();
    }
}
