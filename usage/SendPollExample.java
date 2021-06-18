package usage;

import api.ApiMethodInterface;
import api.entities.methods.SendPoll;

public class SendPollExample {
    public static void main(String[] args) {
        SendPoll poll = new SendPoll(
                1135629135,
                "Do you want to go for fishing at the next Sunday?",
                new String[]{
                        "No",
                        "Yes",
                        "I`ll try"
                }
        );
        poll.correct_option_id = 1;
        String pollStringView = ApiMethodInterface.serviceLocator.getJsonTranslator().toJsonString(poll);
        System.out.println(pollStringView);
    }
}
