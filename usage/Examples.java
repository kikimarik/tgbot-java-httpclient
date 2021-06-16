package usage;

import api.Client;
import api.entities.ApiMethodDTO;
import api.entities.methods.*;
import api.entities.types.BotCommand;
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
        Examples.editMessageLiveLocationExample();
        Examples.stopMessageLiveLocationExample();
        Examples.sendVenueExample();
        Examples.sendContactExample();
        Examples.sendPollExample();
        Examples.sendDiceExample();
        Examples.getUserProfilePhotosExample();
        Examples.getFileExample();
        Examples.setMyCommandsExample();
        Examples.getMyCommandsExample();
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

    /**
     * Simple example of editMessageLiveLocation method
     * @see <a href="https://core.telegram.org/bots/api#editmessagelivelocation">Telegram api editMessageLiveLocation</a>
     * Replace token, chatId, messageId, lat, lon variables with needed values
     */
    private static void editMessageLiveLocationExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        int messageId = 119;
        float lat = (float) 30.7142700;
        float lon = (float) -74.0059700;

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "editMessageLiveLocation",
                new EditMessageLiveLocation(chatId, messageId, lat, lon).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of stopMessageLiveLocation method
     * @see <a href="https://core.telegram.org/bots/api#stopmessagelivelocation">Telegram api stopMessageLiveLocation</a>
     * Replace token, chatId, messageId variables with needed values
     */
    private static void stopMessageLiveLocationExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        int messageId = 119;

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "stopMessageLiveLocation",
                new StopMessageLiveLocation(chatId, messageId).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of sendVenue method
     * @see <a href="https://core.telegram.org/bots/api#sendvenue">Telegram api sendVenue</a>
     * Replace token, chatId, lat, lon, title, address variables with needed values
     */
    private static void sendVenueExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        float lat = (float) 40.7142700;
        float lon = (float) -74.0059700;
        String title = "Such a good place";
        String address = "272 W 115th St, New York, NY 10026";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendVenue",
                new SendVenue(chatId, lat, lon, title, address).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of sendContact method
     * @see <a href="https://core.telegram.org/bots/api#sendcontact">Telegram api sendContact</a>
     * Replace token, chatId, phone, name variables with needed values
     */
    private static void sendContactExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        String phone = "+79990990909";
        String name = "Anonymous";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendContact",
                new SendContact(chatId, phone, name).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of sendPoll method
     * @see <a href="https://core.telegram.org/bots/api#sendpoll">Telegram api sendPoll</a>
     * Replace token, chatId, question, option1, option2, option3 variables with needed values
     */
    private static void sendPollExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        String question = "What is the most dangerous animal at the planet?";
        String option1 = "White bear";
        String option2 = "White shark";
        String option3 = "Anopheles"; // right :D

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendPoll",
                new SendPoll(chatId, question, new String[] {
                        option1,
                        option2,
                        option3
                }).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of sendDice method
     * @see <a href="https://core.telegram.org/bots/api#senddice">Telegram api sendDice</a>
     * Replace token, chatId, emoji, name variables with needed values
     */
    private static void sendDiceExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        String emoji = "⚽";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendDice",
                new SendDice(chatId, emoji).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of getUserProfilePhotos method
     * @see <a href="https://core.telegram.org/bots/api#getuserprofilephotos">Telegram api getUserProfilePhotos</a>
     * Replace token, userId, offset, limit variables with needed values
     */
    private static void getUserProfilePhotosExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int userId = 1135629135;
        int offset = 0;
        int limit = 10;

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "getUserProfilePhotos",
                new GetUserProfilePhotos(userId, offset, limit).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of getFile method
     * @see <a href="https://core.telegram.org/bots/api#getfile">Telegram api getFile</a>
     * Replace token, fileId variables with needed values
     */
    private static void getFileExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        String fileId = "AgACAgIAAxUAAWDIXahYc-Oe8tvoJNbUcTO2VTTrAAJ8rjEbCOuRSG-Wh0tknFT-P1DFki4AAwEAAwIAA2MAA7m_AAIfBA";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "getFile",
                new GetFile(fileId).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of setMyCommands method
     * @see <a href="https://core.telegram.org/bots/api#setmycommands">Telegram api setMyCommands</a>
     * Replace token, command1, desc1, command2, desc2 variables with needed values
     */
    private static void setMyCommandsExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        String command1 = "status";
        String desc1 = "Get current order status";
        String command2 = "cancel";
        String desc2 = "Cancel current order";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "setMyCommands",
                new SetMyCommands(new BotCommand[] {
                        new BotCommand(command1, desc1),
                        new BotCommand(command2, desc2)
                }).toString()
        ));
        System.out.println(response);
    }

    /**
     * Simple example of getMyCommands method
     * @see <a href="https://core.telegram.org/bots/api#getmycommands">Telegram api getMyCommands</a>
     * Replace token vaiable value with your token
     */
    private static void getMyCommandsExample() {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "getMyCommands"
        ));
        System.out.println(response);
    }
}
