package api.entities.methods;

import api.ApiMethodInterface;
import api.entities.types.MessageEntity;
import api.entities.types.ReplyMarkup;

public class SendPoll {
    public int chat_id;
    public String question;
    public String[] options;

    public boolean is_anonymous = true;
    public String type = "regular";
    public boolean allows_multiple_answers = false;
    public Integer correct_option_id;
    public String explanation;
    public String explanation_parse_mode;
    public MessageEntity[] explanation_entities;
    public Integer open_period;
    public Integer close_date;
    public Boolean is_closed;
    public Boolean disable_notification;
    public Integer reply_to_message_id;
    public Boolean allow_sending_without_reply;
    public ReplyMarkup reply_markup;

    public SendPoll() {
    }

    public SendPoll(int chatId, String question, String[] options) {
        this.chat_id = chatId;
        this.question = question;
        this.options = options;
    }

    @Override
    public String toString() {
        return ApiMethodInterface.serviceLocator.getJsonTranslator().toJsonString(this);
    }
}
