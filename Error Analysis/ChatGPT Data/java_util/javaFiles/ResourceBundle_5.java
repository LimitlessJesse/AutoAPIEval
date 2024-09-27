import java.util.*;

public class ResourceBundle_5 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyResources");
        Set<String> keys = bundle.keySet();

        for (String key : keys) {
            System.out.println(key);
        }
    }
}
