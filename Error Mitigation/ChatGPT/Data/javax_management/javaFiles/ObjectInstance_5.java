import javax.management.ObjectInstance;

public class ObjectInstance_5 {
    public static void main(String[] args) {
        ObjectInstance objectInstance = new ObjectInstance("ObjectName", "ClassName");
        int hashCode = objectInstance.hashCode();
        System.out.println("Hash code value: " + hashCode);
    }
}
