package api.methods;

import api.ApiMethodWithBodyInterface;
import base.api.ApiPostMethod;

public class SendLocation extends ApiPostMethod implements ApiMethodWithBodyInterface {

    public SendLocation(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
