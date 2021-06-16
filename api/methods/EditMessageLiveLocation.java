package api.methods;

import api.ApiMethodWithBodyInterface;
import base.api.ApiPostMethod;

public class EditMessageLiveLocation extends ApiPostMethod implements ApiMethodWithBodyInterface {

    public EditMessageLiveLocation(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
