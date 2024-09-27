import java.util.Properties;

public class System_3 {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
