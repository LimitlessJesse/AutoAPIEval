import java.util.jar.Attributes;

public class Attributes_2 {
    public static void main(String[] args) {
        Attributes attributes = new Attributes();
        String previousValue = attributes.putValue("key", "value");
        System.out.println("Previous value: " + previousValue);
    }
}
