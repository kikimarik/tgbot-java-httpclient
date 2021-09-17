package api.entities.methods;

import api.ServiceLocator;

public class GetFile {
    public final String file_id;

    public GetFile(String fileId) {
        this.file_id = fileId;
    }

    @Override
    public String toString() {
        return ServiceLocator.getInstance().getJsonTranslator().toJsonString(this);
    }
}