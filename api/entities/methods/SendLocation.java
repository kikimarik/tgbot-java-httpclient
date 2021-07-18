package api.entities.methods;

import api.ApiMethodInterface;
import api.entities.types.ReplyMarkup;

public class SendLocation {
    public int chat_id;
    public float latitude;
    public float longitude;
    public Float horizontal_accuracy;
    public Integer live_period;
    public Integer heading;
    public Integer proximity_alert_radius;
    public Boolean disable_notification;
    public Integer reply_to_message_id;
    public Boolean allow_sending_without_reply;
    public ReplyMarkup reply_markup;

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
