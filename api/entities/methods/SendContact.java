package api.entities.methods;

import api.ServiceLocator;

/* TODO add all properties */
public class SendContact {
    public final int chat_id;
    public final String phone_number;
    public final String first_name;

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
