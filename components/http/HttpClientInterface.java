package components.http;

import java.io.IOException;

public interface HttpClientInterface {
    String TYPE_JSON = "application/json";
    String TYPE_FORM_DATA = "multipart/form-data";
    HttpClientInterface setContentType(String type);
    HttpClientInterface setMethod(String method);
    HttpClientInterface setUrl(String url);
    HttpClientInterface setBody(String body);
    boolean validate();
    HttpResponseInterface getResponse() throws IOException, InterruptedException;
}
