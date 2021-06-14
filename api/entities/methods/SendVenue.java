package api.entities.methods;

import api.ApiMethodInterface;

public class SendVenue {
    public int chat_id;
    public float latitude;
    public float longitude;
    public String title;
    public String address;

    public SendVenue() {
    }

    public SendVenue(int chatId, float latitude, float longitude, String title, String address) {
        this.chat_id = chatId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.address = address;
    }

    @Override
    public String toString() {
        return ApiMethodInterface.serviceLocator.getJsonTranslator().toJsonString(this);
    }
}
