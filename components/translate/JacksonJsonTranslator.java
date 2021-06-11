package components.translate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import components.translate.exception.JsonTranslatorException;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* TODO implement other methods */
public class JacksonJsonTranslator implements JsonTranslatorInterface {

    private final ObjectMapper mapper = new ObjectMapper();
    
    @Override
    public void toFile(Object entity, File file) {

    }

    @Override
    public void toFile(String jsonString, File file) {
    }

    @Override
    public String fromFile(Class<?> classname, File file) {
        return null;
    }

    @Override
    public Object toObject(Class<?> classname, String jsonString) {
        try {
            return mapper.readValue(jsonString, classname);
        } catch (IOException exception) {
            throw new JsonTranslatorException("Could not convert JSON string to object");
        }
    }

    @Override
    public Object toObject(Class<?> classname, File file) {
        return null;
    }

    @Override
    public String toJsonString(Object entity) {
        try {
            return mapper.writeValueAsString(entity);
        } catch (JsonProcessingException exception) {
            throw new JsonTranslatorException("Could not convert to string");
        }
    }

    public HashMap<String, Object> toHashMap(Class<?> classname, String jsonString) {
        Object object = this.toObject(classname, jsonString);
        return mapper.convertValue(object, HashMap.class);
    }
}
