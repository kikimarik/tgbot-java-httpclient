package api.entities.methods;

import api.ServiceLocator;

import java.util.LinkedHashMap;

/* TODO add all properties */
public class SendVoice {
    public int chat_id;
    public LinkedHashMap<String, String> voice;

    public SendVoice(int chatId, String filePath) {
        this.chat_id = chatId;
        LinkedHashMap<String, String> map = new LinkedHashMap<>(2);
        map.put("path", filePath);
        this.voice = map;
    }

    public SendVoice() {
    }

    public void setVoice(LinkedHashMap<String, String> filePathMap) {
        this.voice = filePathMap;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}

