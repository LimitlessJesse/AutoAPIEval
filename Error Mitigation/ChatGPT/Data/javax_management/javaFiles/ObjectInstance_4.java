import javax.management.ObjectInstance;

public class ObjectInstance_4 {
    public static void main(String[] args) {
        ObjectInstance obj1 = new ObjectInstance("name1", "class1");
        ObjectInstance obj2 = new ObjectInstance("name1", "class1");
        
        System.out.println(obj1.equals(obj2)); // Output: true
    }
}
