package api.entities.methods;

import api.entities.types.MessageEntity;
import api.entities.types.ReplyMarkup;

public class CopyMessage extends ForwardMessage {

    public String caption;
    public String parse_mode;
    public MessageEntity[] caption_entities;
    public Boolean disable_notification;
    public Integer reply_to_message_id;
    public Boolean allow_sending_without_reply;
    public ReplyMarkup reply_markup;

    public CopyMessage(int chatId, int fromChatId, int messageId) {
        super(chatId, fromChatId, messageId);
    }
}
