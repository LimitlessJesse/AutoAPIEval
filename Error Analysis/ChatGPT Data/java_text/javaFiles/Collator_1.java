import java.text.Collator;

public class Collator_1 {
    public static void main(String[] args) {
        // Create a Collator object for comparing strings
        Collator collator = Collator.getInstance();

        // Compare two strings using Collator
        String source = "apple";
        String target = "banana";
        int result = collator.compare(source, target);

        // Print the comparison result
        if(result < 0) {
            System.out.println(source + " comes before " + target);
        } else if(result > 0) {
            System.out.println(source + " comes after " + target);
        } else {
            System.out.println(source + " is equal to " + target);
        }
    }
}
