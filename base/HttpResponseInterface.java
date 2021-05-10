package base;

import java.net.http.HttpHeaders;

public interface HttpResponseInterface {
    int getStatusCode();
    String[] getErrors();
    String getBody();

    void load(int statusCode, String body, HttpHeaders headers);
}
