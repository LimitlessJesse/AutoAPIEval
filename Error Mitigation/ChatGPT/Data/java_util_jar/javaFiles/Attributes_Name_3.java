import java.util.jar.Attributes;

public class Attributes_Name_3 {
    public static void main(String[] args) {
        Attributes.Name attributeName1 = new Attributes.Name("Name1");
        Attributes.Name attributeName2 = new Attributes.Name("Name2");

        System.out.println(attributeName1.equals(attributeName2)); // Output: false
    }
}
