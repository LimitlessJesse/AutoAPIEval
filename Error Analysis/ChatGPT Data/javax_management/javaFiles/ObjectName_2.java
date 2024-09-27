import javax.management.ObjectName;

public class ObjectName_2 {
    public static void main(String[] args) {
        try {
            ObjectName objectName = new ObjectName("com.example:type=MyType,name=MyName");
            String keyProperty = objectName.getKeyProperty("name");
            System.out.println("Key Property: " + keyProperty);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
