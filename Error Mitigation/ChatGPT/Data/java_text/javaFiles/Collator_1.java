import java.text.Collator;

public class Collator_1 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance();
        String source = "apple";
        String target = "banana";
        
        int result = collator.compare(source, target);
        
        if(result < 0) {
            System.out.println("source is less than target");
        } else if(result == 0) {
            System.out.println("source is equal to target");
        } else {
            System.out.println("source is greater than target");
        }
    }
}
