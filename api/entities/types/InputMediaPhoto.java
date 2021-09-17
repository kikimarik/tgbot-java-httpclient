package api.entities.types;

import base.entities.types.InputMedia;

public class InputMediaPhoto extends InputMedia {
    public InputMediaPhoto(String media) {
        super("photo", media);
    }
    public InputMediaPhoto() {
        super();
        this.type = "photo";
    }
}
