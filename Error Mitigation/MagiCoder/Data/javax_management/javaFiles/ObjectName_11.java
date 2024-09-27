import javax.management.ObjectName;

public class ObjectName_11 {
    public static void main(String[] args) {
        try {
            ObjectName obj1 = new ObjectName("com.example:type=Test");
            ObjectName obj2 = new ObjectName("com.example:type=Test");
            ObjectName obj3 = new ObjectName("com.example:type=Test2");

            System.out.println(obj1.equals(obj2));  // Output: true
            System.out.println(obj1.equals(obj3));  // Output: false
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
