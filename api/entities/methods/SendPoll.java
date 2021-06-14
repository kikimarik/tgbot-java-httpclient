package api.entities.methods;

import api.ApiMethodInterface;

public class SendPoll {
    public int chat_id;
    public String question;
    public String[] options;

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
