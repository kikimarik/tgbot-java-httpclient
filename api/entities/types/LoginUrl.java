package api.entities.types;

public class LoginUrl {
    public String url;
    public String forward_text;
    public String bot_username;
    public Boolean request_write_access;

    public LoginUrl(String url) {
        this.url = url;
    }
}
