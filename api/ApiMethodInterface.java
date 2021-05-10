package api;

import base.ServiceLocator;
import java.io.IOException;

public interface ApiMethodInterface {
    ServiceLocator serviceLocator = new ServiceLocator();
    String httpRoot = "https://api.telegram.org/bot";
    String send(String token) throws IOException, InterruptedException;
    void setQueryPath(String[] params);
}
