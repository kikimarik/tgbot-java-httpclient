package api.entities.methods;

import api.ApiMethodInterface;
import api.entities.types.ReplyMarkup;

public class StopMessageLiveLocation {
    public int chat_id;
    public int message_id;
    public ReplyMarkup reply_markup;

    public StopMessageLiveLocation() {
    }

    public StopMessageLiveLocation(int chatId, int messageId) {
        this.chat_id = chatId;
        this.message_id = messageId;
    }

    @Override
    public String toString() {
        return ApiMethodInterface.serviceLocator.getJsonTranslator().toJsonString(this);
    }
}
