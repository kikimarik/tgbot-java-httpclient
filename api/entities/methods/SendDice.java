package api.entities.methods;

import api.ServiceLocator;
import api.entities.types.ReplyMarkup;

public class SendDice {
    public final int chat_id;
    public final String emoji;
    public Boolean disable_notification;
    public Integer reply_to_message_id;
    public Boolean allow_sending_without_reply;
    public ReplyMarkup reply_markup;

    public SendDice(int chatId, String emoji) {
        this.chat_id = chatId;
        this.emoji = emoji;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}
