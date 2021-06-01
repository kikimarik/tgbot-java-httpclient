package api.entities;

public class ApiMethodDTO {
    private final String method;
    private String body;
    private String[] params;

    public ApiMethodDTO(String method) {
        this.method = method;
    }

    public ApiMethodDTO(String method, String[] params) {
        this.params = params;
        this.method = method;
    }

    public ApiMethodDTO(String method, String body) {
        this.body = body;
        this.method = method;
    }

    public ApiMethodDTO(String method, String[] params, String body) {
        this.body = body;
        this.params = params;
        this.method = method;
    }

    public String getMethod() {
        return method;
    }

    public String getBody() {
        return body;
    }

    public String[] getParams() {
        return params;
    }
}
