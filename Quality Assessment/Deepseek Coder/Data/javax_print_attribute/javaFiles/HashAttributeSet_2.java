import javax.print.attribute.HashAttributeSet;
import javax.print.attribute.standard.Media;

public class HashAttributeSet_2 {
    public static void main(String[] args) {
        // Create a HashAttributeSet
        HashAttributeSet attributeSet = new HashAttributeSet();

        // Add an attribute to the HashAttributeSet
        attributeSet.add(new Media("ISO_A4"));

        // Print the HashAttributeSet
        System.out.println("Before removal: " + attributeSet);

        // Remove the attribute from the HashAttributeSet
        boolean isRemoved = attributeSet.remove(new Media("ISO_A4"));

        // Print the result of the removal
        System.out.println("Is the attribute removed? " + isRemoved);

        // Print the HashAttributeSet after removal
        System.out.println("After removal: " + attributeSet);
    }
}
