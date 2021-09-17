package api.entities.types;

import base.entities.types.InputMedia;

public class InputMediaDocument extends InputMedia {
    public Boolean disable_content_type_detection;

    public InputMediaDocument(String media) {
        super("document", media);
    }
    public InputMediaDocument() {
        super();
        this.type = "document";
    }
}
