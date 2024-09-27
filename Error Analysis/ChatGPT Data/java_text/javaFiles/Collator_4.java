import java.text.Collator;

public class Collator_4 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance();
        Collator collatorClone = (Collator) collator.clone();
        
        String str1 = "apple";
        String str2 = "banana";
        
        int result = collator.compare(str1, str2);
        System.out.println("Comparison result using original collator: " + result);
        
        int resultClone = collatorClone.compare(str1, str2);
        System.out.println("Comparison result using cloned collator: " + resultClone);
    }
}
