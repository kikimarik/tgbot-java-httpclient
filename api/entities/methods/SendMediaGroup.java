package api.entities.methods;

import api.ServiceLocator;
import base.entities.types.InputMedia;

/* TODO add all properties */
public class SendMediaGroup {
    public int chat_id;
    public InputMedia[] media;

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
