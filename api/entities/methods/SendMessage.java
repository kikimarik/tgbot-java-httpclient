package api.entities.methods;

import api.ServiceLocator;

/* TODO add all properties */
public class SendMessage {

    public final int chat_id;
    public final String text;
    public String parse_mode;

    public SendMessage(int chatId, String text) {
        this.chat_id = chatId;
        this.text = text;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}
