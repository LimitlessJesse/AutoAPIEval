import javax.management.ObjectName;

public class ObjectName_1 {
    public static void main(String[] args) {
        try {
            ObjectName objectName = new ObjectName("com.example:type=MyMBean,*");
            boolean isPattern = objectName.isPattern();
            System.out.println("Is pattern: " + isPattern);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
