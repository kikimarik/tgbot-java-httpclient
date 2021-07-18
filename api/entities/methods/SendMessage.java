package api.entities.methods;

import api.ServiceLocator;
import api.entities.types.MessageEntity;
import api.entities.types.ReplyMarkup;

public class SendMessage {

    public final int chat_id;
    public final String text;
    public String parse_mode;
    public MessageEntity[] entities;
    public Boolean disable_web_page_preview;
    public Boolean disable_notification;
    public Integer reply_to_message_id;
    public Boolean allow_sending_without_reply;
    public ReplyMarkup reply_markup;

    public SendMessage(int chatId, String text) {
        this.chat_id = chatId;
        this.text = text;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}
