package api.methods;

import api.ApiMethodWithBodyInterface;
import base.api.ApiPostMethod;

public class StopMessageLiveLocation extends ApiPostMethod implements ApiMethodWithBodyInterface {

    public StopMessageLiveLocation(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
