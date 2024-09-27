import javax.management.ObjectName;

public class ObjectName_13 {
    public static void main(String[] args) throws Exception {
        ObjectName name = new ObjectName("com.example:type=Test");
        System.out.println(name.toString());
    }
}
