import java.util.Vector;

public class Vector_3 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        
        System.out.println("Vector before removal: " + vector);
        
        boolean removed = vector.removeElement("Banana");
        
        System.out.println("Element 'Banana' removed: " + removed);
        System.out.println("Vector after removal: " + vector);
    }
}
