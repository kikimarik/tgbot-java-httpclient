package api.entities.methods;

import api.ServiceLocator;

import java.util.LinkedHashMap;

/* TODO add all properties */
public class SendPhoto {
    public int chat_id;
    public LinkedHashMap<String, String> photo;

    public SendPhoto(int chatId, String filePath) {
        this.chat_id = chatId;
        LinkedHashMap<String, String> map = new LinkedHashMap<>(2);
        map.put("path", filePath);
        this.photo = map;
    }

    public SendPhoto() {
    }

    public void setPhoto(LinkedHashMap<String, String> filePathMap) {
        this.photo = filePathMap;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}
