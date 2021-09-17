package api;

import api.entities.ApiMethodDTO;

import java.io.IOException;

public class Client {

    private static Client instance;

    private Client() {
    }

    public static Client getInstance() {
        if (Client.instance == null) {
            Client.instance = new Client();
        }
        return Client.instance;
    }

    public String send(String token, ApiMethodDTO entity) {
        RouteMap routeMap = new RouteMap();
        ApiMethodInterface apiMethodImplementation = routeMap.get(entity.getMethod());
        if (apiMethodImplementation == null) {
            throw new RuntimeException("Method not allowed");
        }
        try {
            if (apiMethodImplementation instanceof ApiMethodWithBodyInterface) {
                ((ApiMethodWithBodyInterface) apiMethodImplementation).setBodyParams(entity.getBody());
            }
            if (apiMethodImplementation instanceof ApiMethodWithParamsInterface) {
                ((ApiMethodWithParamsInterface) apiMethodImplementation).setQueryParams(entity.getParams());
            }
            return apiMethodImplementation.send(token);
        } catch (InterruptedException| IOException exception) {
            throw new RuntimeException("Client error: " + exception.getMessage());
        }
    }
}
