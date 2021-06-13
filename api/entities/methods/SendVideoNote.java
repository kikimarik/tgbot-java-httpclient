package api.entities.methods;

import api.ServiceLocator;

import java.util.LinkedHashMap;

/* TODO add all properties */
public class SendVideoNote {
    public int chat_id;
    public LinkedHashMap<String, String> video_note;

    public SendVideoNote(int chatId, String filePath) {
        this.chat_id = chatId;
        LinkedHashMap<String, String> map = new LinkedHashMap<>(2);
        map.put("path", filePath);
        this.video_note = map;
    }

    public SendVideoNote() {
    }

    public void setVideo_note(LinkedHashMap<String, String> filePathMap) {
        this.video_note = filePathMap;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}

