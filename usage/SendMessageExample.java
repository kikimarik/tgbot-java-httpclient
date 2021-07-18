package usage;

import api.Client;
import api.entities.ApiMethodDTO;
import api.entities.methods.SendMessage;
import api.entities.types.MessageEntity;
import api.entities.types.User;

public class SendMessageExample {
    public static void main(String[] args) {
        User user = new User();
        user.id = 1135629135L;
        user.is_bot = false;
        user.first_name = "Cool guy";
//        SendMessage message = new SendMessage(1135629135, "<b>Is @kikimarik cool guy? :D</b>");
//        message.parse_mode = MessageConstants.PARSE_HTML;
        SendMessage message = new SendMessage(465890238, "Is he cool guy? :D");
        message.entities = new MessageEntity[] {
                new MessageEntity("text_mention", 3, 2, user)
        };
        System.out.println(message);

        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendMessage",
                message.toString()
        ));
        System.out.println(response);
    }
}
