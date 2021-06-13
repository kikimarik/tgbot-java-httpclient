package api.entities.types;

import base.entities.types.InputMedia;

/* TODO add all properties */
public class InputMediaDocument extends InputMedia {
    public InputMediaDocument(String media) {
        super("document", media);
    }
    public InputMediaDocument() {
        super();
    }
}
