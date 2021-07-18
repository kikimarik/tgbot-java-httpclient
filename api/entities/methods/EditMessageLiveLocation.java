package api.entities.methods;

import api.ApiMethodInterface;
import api.entities.types.ReplyMarkup;

public class EditMessageLiveLocation {
    public int chat_id;
    public int message_id;
    public float latitude;
    public float longitude;
    public Float horizontal_accuracy;
    public Integer heading;
    public Integer proximity_alert_radius;
    public ReplyMarkup reply_markup;

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
