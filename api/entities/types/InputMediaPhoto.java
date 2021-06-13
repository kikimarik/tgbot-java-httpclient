package api.entities.types;

import base.entities.types.InputMedia;

/* TODO add all properties */
public class InputMediaPhoto extends InputMedia {
    public InputMediaPhoto(String media) {
        super("photo", media);
    }
    public InputMediaPhoto() {
        super();
    }
}
