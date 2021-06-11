package api.entities.methods;

import api.ServiceLocator;

import java.util.LinkedHashMap;

/* TODO add all properties */
public class SendAudio {
    public int chat_id;
    public LinkedHashMap<String, String> audio;

    public SendAudio(int chatId, String filePath) {
        this.chat_id = chatId;
        LinkedHashMap<String, String> map = new LinkedHashMap<>(2);
        map.put("path", filePath);
        this.audio = map;
    }

    public SendAudio() {
    }

    public void setAudio(LinkedHashMap<String, String> filePathMap) {
        this.audio = filePathMap;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}
