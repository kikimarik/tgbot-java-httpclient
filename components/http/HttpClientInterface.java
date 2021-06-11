package components.http;

import java.io.IOException;
import java.util.HashMap;

public interface HttpClientInterface {
    String TYPE_JSON = "application/json";
    String TYPE_FORM_DATA = "multipart/form-data";
    HttpClientInterface setContentType(String type);
    HttpClientInterface setMethod(String method);
    HttpClientInterface setUrl(String url);
    HttpClientInterface setBody(String body);
    HttpClientInterface setBodyMap(HashMap<String, Object> bodyMap);
    boolean validate();
    HttpResponseInterface getResponse() throws IOException, InterruptedException;
}
