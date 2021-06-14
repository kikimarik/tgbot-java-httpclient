package api.entities.methods;

import api.ApiMethodInterface;

public class EditMessageLiveLocation {
    public int chat_id;
    public int message_id;
    public float latitude;
    public float longitude;

    public EditMessageLiveLocation() {
    }

    public EditMessageLiveLocation(int chatId, int messageId, float latitude, float longitude) {
        this.chat_id = chatId;
        this.message_id = messageId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return ApiMethodInterface.serviceLocator.getJsonTranslator().toJsonString(this);
    }
}
