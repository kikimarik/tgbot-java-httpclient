package api.methods;

import api.ApiMethodWithBodyInterface;
import base.api.ApiPostMethod;

public class SendMessage extends ApiPostMethod implements ApiMethodWithBodyInterface {

    public SendMessage(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
