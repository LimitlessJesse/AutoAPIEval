import java.util.jar.Attributes;
import java.util.jar.JarEntry;

public class Attributes_Name_3 {
    public static void main(String[] args) {
        Attributes.Name name1 = new Attributes.Name("name1");
        Attributes.Name name2 = new Attributes.Name("name2");
        Attributes.Name name3 = new Attributes.Name("name1");

        System.out.println(name1.equals(name2)); // false
        System.out.println(name1.equals(name3)); // true
    }
}
