package api.methods;

import api.ApiMethodWithBodyInterface;
import base.api.ApiPostMethod;

public class SendMediaGroup extends ApiPostMethod implements ApiMethodWithBodyInterface {

    public SendMediaGroup(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
