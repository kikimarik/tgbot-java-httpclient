package api.entities.methods;

import api.ServiceLocator;
import api.entities.types.MessageEntity;
import api.entities.types.ReplyMarkup;

import java.util.LinkedHashMap;

public class SendDocument {
    public int chat_id;
    public LinkedHashMap<String, String> document;
    public String caption;
    public String parse_mode;
    public MessageEntity[] caption_entities;
    public Boolean disable_notification;
    public Integer reply_to_message_id;
    public Boolean allow_sending_without_reply;
    public ReplyMarkup reply_markup;
    public Boolean disable_content_type_detection;
    public LinkedHashMap<String, String> thumb;

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

    public void setThumb(LinkedHashMap<String, String> filePathMap) {
        this.thumb = filePathMap;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}

