package api;

import api.methods.*;

import java.util.HashMap;

public final class RouteMap extends HashMap <String, ApiMethodInterface> {
    public RouteMap() {
        this.put("getMe", new GetMe("/getMe"));
        this.put("setWebhook", new SetWebhook("/setWebhook"));
        this.put("deleteWebhook", new DeleteWebhook("/deleteWebhook"));
        this.put("getWebhookInfo", new GetWebhookInfo("/getWebhookInfo"));

        this.put("sendMessage", new SendMessage("/sendMessage"));
    }
}
