package api.entities.methods;

import api.ServiceLocator;

public class ForwardMessage {
    public final int chat_id;
    public final int from_chat_id;
    public final int message_id;
    public final boolean disable_notification = false;

    public ForwardMessage(int chatId, int fromChatId, int messageId) {
        this.chat_id = chatId;
        this.from_chat_id = fromChatId;
        this.message_id = messageId;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}
