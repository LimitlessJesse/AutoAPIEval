import java.text.CollationKey;
import java.text.Collator;

public class CollationKey_3 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance();
        CollationKey key = collator.getCollationKey("example");
        
        byte[] byteArray = key.toByteArray();
        
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
    }
}
