import java.util.jar.Attributes;

public class Attributes_Name_3 {
    public static void main(String[] args) {
        Attributes.Name first = new Attributes.Name("First");
        Attributes.Name second = new Attributes.Name("Second");

        System.out.println(first.equals(second)); // false
        System.out.println(first.equals(new Attributes.Name("First"))); // true
    }
}
