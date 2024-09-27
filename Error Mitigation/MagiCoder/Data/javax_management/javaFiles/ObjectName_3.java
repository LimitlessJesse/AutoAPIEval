import javax.management.ObjectName;

public class ObjectName_3 {
    public static void main(String[] args) {
        try {
            ObjectName objectName = new ObjectName("com.example:type=Test,name=Test");
            String keyProperty = objectName.getKeyProperty("name");
            System.out.println(keyProperty);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
