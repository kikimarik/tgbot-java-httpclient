package usage;

import api.entities.constants.MessageConstants;
import api.entities.methods.SendMessage;

public class SendMessageExample {
    public static void main(String[] args) {
        SendMessage message = new SendMessage(1135629135, "test message");
        message.parse_mode = MessageConstants.PARSE_HTML;
        System.out.println(message);
    }
}
