package api.entities.methods;

import api.ServiceLocator;

import java.util.LinkedHashMap;

/* TODO add all properties */
public class SendVideo {
    public int chat_id;
    public LinkedHashMap<String, String> video;

    public SendVideo(int chatId, String filePath) {
        this.chat_id = chatId;
        LinkedHashMap<String, String> map = new LinkedHashMap<>(2);
        map.put("path", filePath);
        this.video = map;
    }

    public SendVideo() {
    }

    public void setVideo(LinkedHashMap<String, String> filePathMap) {
        this.video = filePathMap;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}

