package api;

import java.io.IOException;

public interface ApiMethodInterface {
    ServiceLocator serviceLocator = ServiceLocator.getInstance();
    String httpRoot = "https://api.telegram.org/bot";
    String send(String token) throws IOException, InterruptedException;
}
