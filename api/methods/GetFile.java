package api.methods;

import api.ApiMethodWithBodyInterface;
import base.api.ApiPostMethod;

public class GetFile extends ApiPostMethod implements ApiMethodWithBodyInterface {

    public GetFile(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
