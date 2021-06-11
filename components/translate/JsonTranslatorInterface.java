package components.translate;

import java.io.File;
import java.util.HashMap;

public interface JsonTranslatorInterface {
    void toFile(Object entity, File file);
    void toFile(String jsonString, File file);
    String fromFile(Class<?> classname, File file);
    Object toObject(Class<?> classname, String jsonString);
    Object toObject(Class<?> classname, File file);
    String toJsonString(Object entity);
    HashMap<String, Object> toHashMap(Class<?> classname, String jsonString);
}
