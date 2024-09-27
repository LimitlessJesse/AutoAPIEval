import java.util.jar.Attributes;

public class Attributes_1 {
    public static void main(String[] args) {
        Attributes attributes = new Attributes();
        attributes.put(new Attributes.Name("key1"), "value1");
        attributes.put(new Attributes.Name("key2"), "value2");

        String value = attributes.getValue("key1");
        System.out.println("Value for key1: " + value);

        value = attributes.getValue("key3");
        System.out.println("Value for key3: " + value);
    }
}
