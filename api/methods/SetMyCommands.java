package api.methods;

import api.ApiMethodWithBodyInterface;
import base.api.ApiPostMethod;

public class SetMyCommands extends ApiPostMethod implements ApiMethodWithBodyInterface {

    public SetMyCommands(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
