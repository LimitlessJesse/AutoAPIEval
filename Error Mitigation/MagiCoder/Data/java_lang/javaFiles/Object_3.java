import java.lang.Object;

public class Object_3 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj1;

        // Testing reflexivity
        System.out.println("Reflexivity: " + obj1.equals(obj1)); // Expected: true

        // Testing symmetry
        System.out.println("Symmetry: " + (obj1.equals(obj2) == obj2.equals(obj1))); // Expected: true

        // Testing transitivity
        System.out.println("Transitivity: " + (obj1.equals(obj2) && obj2.equals(obj3) == obj1.equals(obj3))); // Expected: true

        // Testing consistency
        System.out.println("Consistency: " + (obj1.equals(obj2) == obj1.equals(obj2))); // Expected: true

        // Testing null
        System.out.println("Null: " + (obj1.equals(null))); // Expected: false
    }
}
