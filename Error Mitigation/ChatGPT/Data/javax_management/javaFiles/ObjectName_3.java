import javax.management.ObjectName;

public class ObjectName_3 {
    public static void main(String[] args) {
        try {
            ObjectName objectName = new ObjectName("com.example:type=MyMBean,name=MyMBean1");
            String value = objectName.getKeyProperty("name");
            System.out.println("Value of 'name' property: " + value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
