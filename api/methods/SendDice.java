package api.methods;

import api.ApiMethodWithBodyInterface;
import base.api.ApiPostMethod;

import java.io.IOException;

public class SendDice extends ApiPostMethod implements ApiMethodWithBodyInterface {

    public SendDice(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
