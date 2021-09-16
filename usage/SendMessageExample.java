package usage;

import api.Client;
import api.entities.ApiMethodDTO;
import api.entities.methods.SendMessage;
import api.entities.types.InlineKeyboardButton;
import api.entities.types.MessageEntity;
import api.entities.types.User;
import api.entities.types.reply.InlineKeyboardMarkup;

public class SendMessageExample {
    public static void main(String[] args) {
        User user = new User();
        user.id = 1135629135L;
        user.is_bot = false;
        user.first_name = "Cool guy";
        SendMessage message = new SendMessage(1135629135, "Is he cool guy? :D");
        message.entities = new MessageEntity[] {
                new MessageEntity("text_mention", 3, 2, user)
        };
        InlineKeyboardMarkup replyKeyboardMarkup = new InlineKeyboardMarkup(new InlineKeyboardButton[]{
                new InlineKeyboardButton("Handsome", "Send some data to your server"),
                new InlineKeyboardButton("Winner", "Send some data to your server"),
                new InlineKeyboardButton("Nice", "Send some data to your server"),
        });
        replyKeyboardMarkup.nextRow();
        replyKeyboardMarkup.addButtons(new InlineKeyboardButton[]{
                new InlineKeyboardButton("Ugly", "Send some data to your server"),
                new InlineKeyboardButton("Looser", "Send some data to your server"),
                new InlineKeyboardButton("Bad", "Send some data to your server"),
        });
        replyKeyboardMarkup.addButton(new InlineKeyboardButton("Stupid", "Send some data to your server"));
        replyKeyboardMarkup.prevRow();
        replyKeyboardMarkup.addButton(new InlineKeyboardButton("Clever", "Send some data to your server"));
        message.reply_markup = replyKeyboardMarkup;

        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendMessage",
                message.toString()
        ));
        System.out.println(response);
    }
}
