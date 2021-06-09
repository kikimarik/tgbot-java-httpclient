package components.translate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import components.translate.exception.JsonTranslatorException;

import java.io.File;

/* TODO implement other methods */
public class JacksonJsonTranslator implements JsonTranslatorInterface {

    private ObjectMapper mapper = new ObjectMapper();
    
    @Override
    public void toFile(Object entity, File file) {

    }

    @Override
    public void toFile(String jsonString, File file) {

    }

    @Override
    public String fromFile(String classname, File file) {
        return null;
    }

    @Override
    public Object toObject(String classname, String jsonString) {
        return null;
    }

    @Override
    public Object toObject(String classname, File file) {
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
}
