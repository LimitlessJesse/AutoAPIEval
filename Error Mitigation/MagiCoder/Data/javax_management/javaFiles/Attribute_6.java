import javax.management.Attribute;

public class Attribute_6 {
    public static void main(String[] args) {
        Attribute attribute = new Attribute("name", "value");
        int hashCode = attribute.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
