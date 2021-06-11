package api.entities.methods;

import api.ServiceLocator;

import java.util.LinkedHashMap;

/* TODO add all properties */
public class SendDocument {
    public int chat_id;
    public LinkedHashMap<String, String> document;

    public SendDocument(int chatId, String filePath) {
        this.chat_id = chatId;
        LinkedHashMap<String, String> map = new LinkedHashMap<>(2);
        map.put("path", filePath);
        this.document = map;
    }

    public SendDocument() {
    }

    public void setDocument(LinkedHashMap<String, String> filePathMap) {
        this.document = filePathMap;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}

