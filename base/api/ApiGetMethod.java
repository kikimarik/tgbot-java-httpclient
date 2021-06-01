package base.api;

import api.ApiMethodInterface;
import java.io.IOException;

public abstract class ApiGetMethod {

    protected String httpMethod = "";

    public String send(String token) throws IOException, InterruptedException {
        return ApiMethodInterface.serviceLocator.getClient()
                .setMethod("GET")
                .setUrl(ApiMethodInterface.httpRoot + token + this.httpMethod)
                .getResponse()
                .getBody();
    }
}
