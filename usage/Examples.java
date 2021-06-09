package usage;

import api.Client;
import api.entities.ApiMethodDTO;
import api.entities.methods.ForwardMessage;
import api.entities.methods.SendMessage;

public class Examples {

    public static void main(String[] args) {
        Examples.getMeExample();
        Examples.sendMessageExample();
        Examples.setWebhookExample();
        Examples.forwardMessageExample();
    }

    /**
     * Simple example of getMe method
     * @see <a href="https://core.telegram.org/bots/api#getme">Telegram api getMe</a>
     * Replace token vaiable value with your token
     */
    private static void getMeExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "getMe"
        ));
        System.out.println(response);
    }

    /**
     * Simple example of sendMessage method
     * @see <a href="https://core.telegram.org/bots/api#sendmessage">Telegram api sendMessage</a>
     * Replace token, chatId, text vaiables with needle values
     */
    private static void sendMessageExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        String text = "Hi guy!";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendMessage",
                new SendMessage(chatId, text).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of forwardMessage method
     * @see <a href="https://core.telegram.org/bots/api#forwardmessage">Telegram api forwardMessage</a>
     * Replace token, chatId, messageId vaiables with needle values
     * It will forward target message to the same chat
     */
    private static void forwardMessageExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 286973666;
        int fromChatId = 1135629135;
        int messageId = 25;

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "forwardMessage",
                new ForwardMessage(chatId, fromChatId, messageId).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of setWebhook method
     * @see <a href="https://core.telegram.org/bots/api#setwebhook">Telegram api setWebhook</a>
     * Replace token, url vaiables with needle values
     * Url is a https webpath to your server
     */
    private static void setWebhookExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        String url = "https://github.com/kikimarik";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "setWebhook",
                new String[]{"url=" + url}
        ));
        System.out.println(response);
    }
}
