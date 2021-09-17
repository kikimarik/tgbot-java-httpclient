package api.entities.types;

import base.entities.types.InputMedia;

public class InputMediaVideo extends InputMedia {
    public Integer width;
    public Integer height;
    public Integer duration;
    public Boolean supports_streaming;

    public InputMediaVideo(String media) {
        super("video", media);
    }
    public InputMediaVideo() {
        super();
        this.type = "video";
    }
}
