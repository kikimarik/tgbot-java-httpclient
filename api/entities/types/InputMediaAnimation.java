package api.entities.types;

import base.entities.types.InputMedia;

/* TODO add all properties */
public class InputMediaAnimation extends InputMedia {
    public InputMediaAnimation(String media) {
        super("animation", media);
    }
    public InputMediaAnimation() {
        super();
    }
}
