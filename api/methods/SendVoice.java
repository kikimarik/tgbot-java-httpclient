package api.methods;

import api.ApiMethodWithBodyInterface;
import components.http.HttpClientInterface;

import java.io.IOException;

public class SendVoice implements ApiMethodWithBodyInterface {

    private final String httpMethod;
    private String body;

    public SendVoice(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    @Override
    public String send(String token) throws IOException, InterruptedException {
        return this.serviceLocator.getClient()
                .setMethod("POST")
                .setContentType(HttpClientInterface.TYPE_FORM_DATA)
                .setBodyMap(
                        this.serviceLocator
                                .getJsonTranslator()
                                .toHashMap(api.entities.methods.SendVoice.class, this.body)
                )
                .setUrl(this.httpRoot + token + this.httpMethod)
                .getResponse()
                .getBody();
    }

    @Override
    public void setBodyParams(String jsonBody) {
        this.body = jsonBody;
    }
}