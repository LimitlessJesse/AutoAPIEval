import javax.management.ObjectInstance;

public class ObjectInstance_2 {
    public static void main(String[] args) {
        ObjectInstance objectInstance = new ObjectInstance("ObjectName", "ClassName");
        String className = objectInstance.getClassName();
        System.out.println("Class Name: " + className);
    }
}
