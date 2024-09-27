import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;

public class Attributes_Name_4 {
    public static void main(String[] args) {
        Attributes attributes = new Attributes(1);
        Name name1 = new Name("name");
        Name name2 = new Name("name");
        Name name3 = new Name("anotherName");

        boolean isEqual1 = name1.equals(name2);
        boolean isEqual2 = name1.equals(name3);

        System.out.println("Is name1 equal to name2? " + isEqual1);
        System.out.println("Is name1 equal to name3? " + isEqual2);
    }
}
