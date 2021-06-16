package api.methods;

import api.ApiMethodInterface;
import base.api.ApiGetMethod;

public class GetWebhookInfo extends ApiGetMethod implements ApiMethodInterface {

    public GetWebhookInfo(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
