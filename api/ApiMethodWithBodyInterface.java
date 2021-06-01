package api;

public interface ApiMethodWithBodyInterface extends ApiMethodInterface {
    void setBodyParams(String jsonBody);
}
