package api.entities.methods;

import api.ServiceLocator;

import java.util.LinkedHashMap;

/* TODO add all properties */
public class SendAnimation {
    public int chat_id;
    public LinkedHashMap<String, String> animation;

    public SendAnimation(int chatId, String filePath) {
        this.chat_id = chatId;
        LinkedHashMap<String, String> map = new LinkedHashMap<>(2);
        map.put("path", filePath);
        this.animation = map;
    }

    public SendAnimation() {
    }

    public void setAnimation(LinkedHashMap<String, String> filePathMap) {
        this.animation = filePathMap;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}

