package api.entities.methods;

import api.ApiMethodInterface;

public class SendLocation {
    public int chat_id;
    public float latitude;
    public float longitude;

    public SendLocation() {
    }

    public SendLocation(int chatId, float latitude, float longitude) {
        this.chat_id = chatId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return ApiMethodInterface.serviceLocator.getJsonTranslator().toJsonString(this);
    }
}
