import java.text.Collator;
import java.text.CollationKey;

public class CollationKey_1 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance();
        CollationKey key = collator.getCollationKey("banana");
        byte[] byteArray = key.toByteArray();
        
        System.out.println("Byte Array length: " + byteArray.length);
    }
}
