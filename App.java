import api.ApiMethodInterface;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException, InterruptedException {
        RouteMap routeMap = new RouteMap();
        Scanner scanner = new Scanner(System.in);
        String method = scanner.next();
        scanner.close();
        ApiMethodInterface apiMethodImplementation = routeMap.get(method);
        if (apiMethodImplementation == null) {
            throw new RuntimeException("Method not allowed");
        }
//        apiMethodImplementation.setQueryPath(new String[]{"url=https://github.com/"});
        System.out.println(apiMethodImplementation.send("1804045124:AAFKjv7mBXqR-7RNc5EWtywH-igvKI7izcQ"));
    }
}
