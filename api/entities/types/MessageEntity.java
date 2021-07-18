package api.entities.types;

public class MessageEntity {
    public String type;
    public int offset;
    public int length;
    public String url;
    public User user;
    public String language;

    public MessageEntity(String type, int offset, int length) {
        this.type = type;
        this.offset = offset;
        this.length = length;
    }

    public MessageEntity(String type, int offset, int length, String option) {
        this.type = type;
        this.offset = offset;
        this.length = length;
        switch (type) {
            case "text_link" -> this.url = option;
            case "pre" -> this.language = option;
        }
    }

    public MessageEntity(String type, int offset, int length, User user) {
        this.type = type;
        this.offset = offset;
        this.length = length;
        this.user = user;
    }
}
