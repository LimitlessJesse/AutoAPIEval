import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;

public class Attributes_Name_5 {
    public static void main(String[] args) {
        Attributes attributes = new Attributes();
        Name name = new Name("key");
        int hashCode = name.hashCode();
        System.out.println("Hash code of the attribute name: " + hashCode);
    }
}
