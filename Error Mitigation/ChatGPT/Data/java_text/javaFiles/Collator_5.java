import java.text.Collator;

public class Collator_5 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance();
        int hashCode = collator.hashCode();
        System.out.println("Hash code for Collator: " + hashCode);
    }
}
