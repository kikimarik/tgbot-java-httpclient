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
        this.put("forwardMessage", new SendMessage("/forwardMessage"));
        this.put("copyMessage", new SendMessage("/copyMessage"));

        this.put("sendPhoto", new SendPhoto("/sendPhoto"));
        this.put("sendAudio", new SendAudio("/sendAudio"));
        this.put("sendDocument", new SendDocument("/sendDocument"));
        this.put("sendVideo", new SendVideo("/sendVideo"));
        this.put("sendAnimation", new SendAnimation("/sendAnimation"));
        this.put("sendVoice", new SendVoice("/sendVoice"));
        this.put("sendVideoNote", new SendVideoNote("/sendVideoNote"));
    }
}
