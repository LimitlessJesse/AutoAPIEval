import java.util.jar.Attributes;

public class Attributes_Name_2 {
    public static void main(String[] args) {
        Attributes.Name attributeName = new Attributes.Name("ExampleAttribute");
        int hashCode = attributeName.hashCode();
        System.out.println("Hash code for attribute name: " + hashCode);
    }
}
