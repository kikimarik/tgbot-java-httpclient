package api.methods;

import api.ApiMethodWithBodyInterface;

import java.io.IOException;

public class SetMyCommands implements ApiMethodWithBodyInterface {

    private final String httpMethod;
    private String body;

    public SetMyCommands(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Override
    public String send(String token) throws IOException, InterruptedException {
        return this.serviceLocator.getClient()
                .setMethod("POST")
                .setBody(this.body)
                .setUrl(this.httpRoot + token + this.httpMethod)
                .getResponse()
                .getBody();
    }

    @Override
    public void setBodyParams(String jsonBody) {
        this.body = jsonBody;
    }
}
