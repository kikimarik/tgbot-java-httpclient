package base;

import java.io.IOException;

public interface HttpClientInterface {
    HttpClientInterface setMethod(String method);
    HttpClientInterface setUrl(String url);
    HttpClientInterface setBody(String body);
    boolean validate();
    HttpResponseInterface getResponse() throws IOException, InterruptedException;
}
