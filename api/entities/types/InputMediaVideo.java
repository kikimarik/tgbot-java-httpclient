package api.entities.types;

import base.entities.types.InputMedia;

/* TODO add all properties */
public class InputMediaVideo extends InputMedia {
    public InputMediaVideo(String media) {
        super("video", media);
    }
    public InputMediaVideo() {
        super();
    }
}
