import java.util.jar.Attributes;

public class Attributes_5 {
    public static void main(String[] args) {
        Attributes attributes = new Attributes();
        attributes.putValue("key1", "value1");
        attributes.putValue("key2", "value2");
        
        System.out.println("Before clearing: " + attributes);
        attributes.clear();
        System.out.println("After clearing: " + attributes);
    }
}
