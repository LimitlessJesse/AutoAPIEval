import javax.management.ObjectInstance;
import javax.management.ObjectName;

public class ObjectInstance_1 {
    public static void main(String[] args) {
        ObjectInstance objectInstance = new ObjectInstance(new ObjectName("test:name=Test"), "Test");
        ObjectName objectName = objectInstance.getObjectName();
        System.out.println("Object Name: " + objectName);
    }
}
