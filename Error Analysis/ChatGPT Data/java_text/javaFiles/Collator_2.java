import java.text.Collator;
import java.util.Locale;

public class Collator_2 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        Collator collator = Collator.getInstance(locale);
        
        String str1 = "apple";
        String str2 = "banana";
        
        int result = collator.compare(str1, str2);
        
        if (result < 0) {
            System.out.println("\"apple\" is less than \"banana\"");
        } else if (result > 0) {
            System.out.println("\"apple\" is greater than \"banana\"");
        } else {
            System.out.println("\"apple\" is equal to \"banana\"");
        }
    }
}
