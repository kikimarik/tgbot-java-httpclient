package base.entities.types;

/* TODO add all properties */
public abstract class InputMedia {
    public String type;
    public String media;

    public InputMedia(String type, String media) {
        this.type = type;
        this.media = media;
    }

    public InputMedia() {
    }
}
