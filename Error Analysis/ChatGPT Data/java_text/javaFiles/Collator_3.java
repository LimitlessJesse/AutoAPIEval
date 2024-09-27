import java.text.Collator;

public class Collator_3 {
    public static void main(String[] args) {
        // Create Collator object
        Collator collator = Collator.getInstance();
        
        // Display hash code of Collator object
        System.out.println("Hash Code of Collator: " + collator.hashCode());
    }
}
