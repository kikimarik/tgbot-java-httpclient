package api.entities.methods;

import api.ApiMethodInterface;
import api.entities.types.ReplyMarkup;

public class SendVenue {
    public int chat_id;
    public float latitude;
    public float longitude;
    public String title;
    public String address;
    public String foursquare_id;
    public String foursquare_type;
    public String google_place_id;
    public String google_place_type;
    public Boolean disable_notification;
    public Integer reply_to_message_id;
    public Boolean allow_sending_without_reply;
    public ReplyMarkup reply_markup;

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
