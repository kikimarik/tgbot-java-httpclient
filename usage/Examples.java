package usage;

import api.Client;
import api.entities.ApiMethodDTO;
import api.entities.methods.*;
import api.entities.types.InputMediaAudio;
import api.entities.types.InputMediaDocument;
import api.entities.types.InputMediaPhoto;
import api.entities.types.InputMediaVideo;
import base.entities.types.InputMedia;

public class Examples {

    public static void main(String[] args) {
        Examples.getMeExample();
        Examples.sendMessageExample();
        Examples.setWebhookExample();
        Examples.forwardMessageExample();
        Examples.sendPhotoExample();
        Examples.sendAudioExample();
        Examples.sendDocumentExample();
        Examples.sendVideoExample();
        Examples.sendAnimationExample();
        Examples.sendVideoNoteExample();
        Examples.sendMediaGroupExample();
        Examples.sendLocationExample();
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
     * Replace token, chatId, text variables with needed values
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
     * Replace token, chatId, messageId variables with needed values
     * It will forward target message to the same chat
     */
    private static void forwardMessageExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int fromChatId = 286973666;
        int chatId = 1135629135;
        int messageId = 26;

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
     * Replace token, url variables with needed values
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

    /**
     * Simple example of sendPhoto method
     * @see <a href="https://core.telegram.org/bots/api#sendphoto">Telegram api sendPhoto</a>
     * Replace token, chatId, filePath variables with needed values
     */
    private static void sendPhotoExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        String filePath = "/home/sergey/tmp/test_java/testPhoto.png";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendPhoto",
                new SendPhoto(chatId, filePath).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of sendAudio method
     * @see <a href="https://core.telegram.org/bots/api#sendaudio">Telegram api sendAudio</a>
     * Replace token, chatId, filePath variables with needed values
     */
    private static void sendAudioExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        String filePath = "/home/sergey/tmp/test_java/umbrella.mp3";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendAudio",
                new SendAudio(chatId, filePath).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of sendDocument method
     * @see <a href="https://core.telegram.org/bots/api#senddocument">Telegram api sendDocument</a>
     * Replace token, chatId, filePath variables with needed values
     */
    private static void sendDocumentExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        String filePath = "/home/sergey/tmp/test_java/rabbitmq_routing.pdf";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendDocument",
                new SendDocument(chatId, filePath).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of sendVideo method
     * @see <a href="https://core.telegram.org/bots/api#sendvideo">Telegram api sendVideo</a>
     * Replace token, chatId, filePath variables with needed values
     */
    private static void sendVideoExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        String filePath = "/home/sergey/tmp/test_java/umbrella.mp4";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendVideo",
                new SendVideo(chatId, filePath).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of sendAnimation method
     * @see <a href="https://core.telegram.org/bots/api#sendanimation">Telegram api sendAnimation</a>
     * Replace token, chatId, filePath variables with needed values
     */
    private static void sendAnimationExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        String filePath = "/home/sergey/tmp/test_java/fuckup.gif";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendAnimation",
                new SendAnimation(chatId, filePath).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of sendVideoNote method
     * @see <a href="https://core.telegram.org/bots/api#sendvideonote">Telegram api sendVideoNote</a>
     * Replace token, chatId, filePath variables with needed values
     */
    private static void sendVideoNoteExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        String filePath = "/home/sergey/tmp/test_java/watterfall.mov";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendVideoNote",
                new SendVideoNote(chatId, filePath).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of sendMediaGroup method
     * @see <a href="https://core.telegram.org/bots/api#sendmediagroup">Telegram api sendMediaGroup</a>
     * Replace token, videoFileId1, videoFileId2, photoFileId variables with needed values
     */
    private static void sendMediaGroupExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        String videoFileId1 = "BAACAgIAAxkDAANaYMYeKSqhf6nN1SIX6mw_5yTfzDQAAkkQAALhJDBKqZWML9NtYmYfBA";
        String videoFileId2 = "BAACAgIAAxkDAANbYMYeNOB0LVXDC7sZTR8TGTOEFlUAAksQAALhJDBKbVY28-twIhIfBA";
        String photoFileId = "AgACAgIAAxkDAANcYMYfEhQmzvdfS1nQqaVSZiQewdEAAhu1MRvhJDBKWksKuwQDgxZONkOeLgADAQADAgADdwADgyEFAAEfBA";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendMediaGroup",
                new SendMediaGroup(chatId, new InputMedia[] {
                        new InputMediaVideo(videoFileId1),
                        new InputMediaVideo(videoFileId2),
                        new InputMediaPhoto(photoFileId)
                }).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of sendLocation method
     * @see <a href="https://core.telegram.org/bots/api#sendlocation">Telegram api sendLocation</a>
     * Replace token, chatId, lat, lon variables with needed values
     */
    private static void sendLocationExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        float lat = (float) 40.7142700;
        float lon = (float) -74.0059700;

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendLocation",
                new SendLocation(chatId, lat, lon).toString()
        ));
        System.out.println(response);
    }
}
