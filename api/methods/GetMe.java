package api.methods;

import api.ApiMethodInterface;
import base.api.ApiGetMethod;

public class GetMe extends ApiGetMethod implements ApiMethodInterface {

    public GetMe(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
