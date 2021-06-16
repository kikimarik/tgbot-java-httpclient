package api.methods;

import api.ApiMethodWithBodyInterface;
import base.api.ApiPostMethod;

public class GetUserProfilePhotos extends ApiPostMethod implements ApiMethodWithBodyInterface {

    public GetUserProfilePhotos(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}