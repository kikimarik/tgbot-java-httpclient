package api.entities.methods;

import api.ServiceLocator;
import api.entities.types.MessageEntity;
import api.entities.types.ReplyMarkup;

import java.util.LinkedHashMap;

public class SendAudio {
    public int chat_id;
    public LinkedHashMap<String, String> audio;
    public String caption;
    public String parse_mode;
    public MessageEntity[] caption_entities;
    public Boolean disable_notification;
    public Integer reply_to_message_id;
    public Boolean allow_sending_without_reply;
    public ReplyMarkup reply_markup;
    public Integer duration;
    public String performer;
    public String title;
    public LinkedHashMap<String, String> thumb;

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

    public void setThumb(LinkedHashMap<String, String> filePathMap) {
        this.thumb = filePathMap;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}
