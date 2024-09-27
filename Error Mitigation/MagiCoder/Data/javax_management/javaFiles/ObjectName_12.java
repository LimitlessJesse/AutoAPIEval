import javax.management.ObjectName;

public class ObjectName_12 {
    public static void main(String[] args) {
        try {
            ObjectName objectName = new ObjectName("com.example:type=Test");
            int hashCode = objectName.hashCode();
            System.out.println("Hash code: " + hashCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
