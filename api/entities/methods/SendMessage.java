package api.entities.methods;

import api.ServiceLocator;

public class SendMessage {
    public final int chat_id;
    public final String text;
    /* TODO finish it */
    public SendMessage(int chatId, String text) {
        this.chat_id = chatId;
        this.text = text;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}
