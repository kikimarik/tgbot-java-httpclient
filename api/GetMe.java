package api;

import java.io.IOException;

public class GetMe implements ApiMethodInterface {

    private final String httpMethod;

    public GetMe(String httpMethod) {
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

    @Override
    public void setQueryPath(String[] params) {
        // Nothing to do
    }
}
