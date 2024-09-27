import javax.management.ObjectName;

public class ObjectName_4 {
    public static void main(String[] args) {
        ObjectName pattern = new ObjectName("com.example:type=Example,*");
        ObjectName name = new ObjectName("com.example:type=Example,name=Test");

        boolean result = pattern.apply(name);
        System.out.println("Pattern matches name: " + result);
    }
}
