import javax.management.ObjectName;
import javax.management.MalformedObjectNameException;

public class ObjectName_1 {
    public static void main(String[] args) {
        try {
            ObjectName objectName = new ObjectName("com.example:type=Example");
            boolean isPattern = objectName.isPattern();
            System.out.println("Is Pattern: " + isPattern);
        } catch (MalformedObjectNameException e) {
            System.err.println("Error creating ObjectName: " + e.getMessage());
        }
    }
}
