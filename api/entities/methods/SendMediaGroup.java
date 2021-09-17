package api.entities.methods;

import api.ServiceLocator;
import base.entities.types.InputMedia;

public class SendMediaGroup {
    public int chat_id;
    public InputMedia[] media;
    public Boolean disable_notification;
    public Integer reply_to_message_id;
    public Boolean allow_sending_without_reply;

    public SendMediaGroup(int chatId, InputMedia[] media) {
        this.chat_id = chatId;
        this.media = media;
    }

    public SendMediaGroup() {
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}
