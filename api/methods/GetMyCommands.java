package api.methods;

import api.ApiMethodInterface;
import base.api.ApiGetMethod;

public class GetMyCommands extends ApiGetMethod implements ApiMethodInterface {
    public GetMyCommands(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
