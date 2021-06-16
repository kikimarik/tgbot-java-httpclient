package base.api;

import api.ApiMethodInterface;

import java.io.IOException;

public class ApiPostMethod {
    protected String httpMethod = "";
    protected String body;

    public String send(String token) throws IOException, InterruptedException {
        return ApiMethodInterface.serviceLocator.getClient()
                .setMethod("POST")
                .setBody(this.body)
                .setUrl(ApiMethodInterface.httpRoot + token + this.httpMethod)
                .getResponse()
                .getBody();
    }

    public void setBodyParams(String jsonBody) {
        this.body = jsonBody;
    }
}
