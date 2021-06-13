package api.entities.types;

import base.entities.types.InputMedia;

/* TODO add all properties */
public class InputMediaAudio extends InputMedia {
    public InputMediaAudio(String media) {
        super("audio", media);
    }
    public InputMediaAudio() {
        super();
    }
}
