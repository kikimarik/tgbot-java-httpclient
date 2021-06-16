package api.methods;

import api.ApiMethodWithBodyInterface;
import base.api.ApiPostMethod;

import java.io.IOException;

public class SendVenue extends ApiPostMethod implements ApiMethodWithBodyInterface {

    public SendVenue(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
