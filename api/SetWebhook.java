package api;

import java.io.IOException;

public class SetWebhook implements ApiMethodInterface {

    private final String httpMethod;
    private String queryPath = "";

    public SetWebhook(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Override
    public String send(String token) throws IOException, InterruptedException {
        return this.serviceLocator.getClient()
                .setMethod("GET")
                .setUrl(this.httpRoot + token + this.httpMethod + this.queryPath)
                .getResponse()
                .getBody();
    }

    @Override
    public void setQueryPath(String[] params) {
        // TODO change to Map
        char separator = '?';
        StringBuilder buffer = new StringBuilder();
        for (String param:
             params) {
            buffer.append(separator).append(param);
            separator = '&';
        }
        this.queryPath = buffer.toString();
    }
}
