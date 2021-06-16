package api.entities.methods;

import api.ApiMethodInterface;

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
