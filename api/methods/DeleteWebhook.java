package api.methods;

import api.ApiMethodInterface;
import base.api.ApiGetMethod;

public class DeleteWebhook extends ApiGetMethod implements ApiMethodInterface {

    public DeleteWebhook(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
