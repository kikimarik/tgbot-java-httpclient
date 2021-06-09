package api.methods;

import api.ApiMethodWithBodyInterface;

public class CopyMessage extends ForwardMessage implements ApiMethodWithBodyInterface {
    public CopyMessage(String httpMethod) {
        super(httpMethod);
    }
}
