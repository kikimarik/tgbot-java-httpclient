package api.methods;

import api.ApiMethodWithBodyInterface;
import base.api.ApiPostMethod;

public class ForwardMessage extends ApiPostMethod implements ApiMethodWithBodyInterface {

    public ForwardMessage(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
