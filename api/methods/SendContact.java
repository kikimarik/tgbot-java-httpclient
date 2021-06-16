package api.methods;

import api.ApiMethodWithBodyInterface;
import base.api.ApiPostMethod;

public class SendContact extends ApiPostMethod implements ApiMethodWithBodyInterface {

    public SendContact(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
