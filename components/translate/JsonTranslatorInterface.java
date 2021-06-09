package components.translate;

import java.io.File;

public interface JsonTranslatorInterface {
    void toFile(Object entity, File file);
    void toFile(String jsonString, File file);
    String fromFile(String classname, File file);
    Object toObject(String classname, String jsonString);
    Object toObject(String classname, File file);
    String toJsonString(Object entity);
}
