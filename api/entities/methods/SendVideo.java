package api.entities.methods;

import api.ServiceLocator;
import api.entities.types.MessageEntity;
import api.entities.types.ReplyMarkup;

import java.util.LinkedHashMap;

public class SendVideo {
    public int chat_id;
    public LinkedHashMap<String, String> video;
    public Integer width;
    public Integer height;
    public Boolean supports_streaming;
    public String caption;
    public String parse_mode;
    public MessageEntity[] caption_entities;
    public Boolean disable_notification;
    public Integer reply_to_message_id;
    public Boolean allow_sending_without_reply;
    public ReplyMarkup reply_markup;
    public Integer duration;
    public LinkedHashMap<String, String> thumb;

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

    public void setThumb(LinkedHashMap<String, String> filePathMap) {
        this.thumb = filePathMap;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}

