import api.ApiMethodInterface;
import api.GetMe;
import api.SetWebhook;

import java.util.HashMap;

public final class RouteMap extends HashMap <String, ApiMethodInterface> {
    public RouteMap() {
        this.put("getMe", new GetMe("/getMe"));
        this.put("setWebhook", new SetWebhook("/setWebhook"));
    }
}
