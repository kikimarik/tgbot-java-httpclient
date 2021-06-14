package api.entities.methods;

import api.ServiceLocator;

/* TODO add all properties */
public class SendDice {
    public final int chat_id;
    public final String emoji;

    public SendDice(int chatId, String emoji) {
        this.chat_id = chatId;
        this.emoji = emoji;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}
