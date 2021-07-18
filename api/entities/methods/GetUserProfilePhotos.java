package api.entities.methods;

import api.ServiceLocator;

public class GetUserProfilePhotos {
    public final int user_id;
    public final int offset;
    public final int limit;

    public GetUserProfilePhotos(int userId, int offset, int limit) {
        this.user_id = userId;
        this.offset = offset;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}