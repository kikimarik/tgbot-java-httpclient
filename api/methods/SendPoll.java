package api.methods;

import api.ApiMethodWithBodyInterface;
import base.api.ApiPostMethod;

public class SendPoll extends ApiPostMethod implements ApiMethodWithBodyInterface {

    public SendPoll(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
