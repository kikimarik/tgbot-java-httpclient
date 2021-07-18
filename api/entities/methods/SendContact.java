package api.entities.methods;

import api.ServiceLocator;
import api.entities.types.ReplyMarkup;

public class SendContact {
    public final int chat_id;
    public final String phone_number;
    public final String first_name;
    public String last_name;
    public String vcard;
    public Boolean disable_notification;
    public Integer reply_to_message_id;
    public Boolean allow_sending_without_reply;
    public ReplyMarkup reply_markup;

    public SendContact(int chatId, String phoneNumber, String firstName) {
        this.chat_id = chatId;
        this.phone_number = phoneNumber;
        this.first_name = firstName;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}
