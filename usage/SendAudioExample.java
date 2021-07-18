package usage;

import api.Client;
import api.entities.ApiMethodDTO;
import api.entities.methods.SendAudio;

import java.util.LinkedHashMap;

public class SendAudioExample {
    public static void main(String[] args) {
        String token = "1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ";
        int chatId = 1135629135;
        String filePath = "/home/sergey/tmp/test_java/umbrella.mp3";
        SendAudio audio = new SendAudio(chatId, filePath);
        audio.title = "Cool song :D";
        String thumbPath = "/home/sergey/tmp/test_java/rihanna_thumb.jpg";
        LinkedHashMap<String, String> thumb = new LinkedHashMap<>();
        thumb.put("path", thumbPath);
        audio.thumb = thumb;
        audio.duration = 30;

        Client client = Client.getInstance();
        String response = client.send(token, new ApiMethodDTO(
                "sendAudio",
                audio.toString()
        ));
        System.out.println(response);
    }
}
