import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_5 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Pattern pattern = Pattern.compile("World");
        Matcher matcher = pattern.matcher(text);
        
        boolean found = matcher.find();
        if(found) {
            System.out.println("Matched found: " + matcher.group());
        } else {
            System.out.println("No match found");
        }
    }
}
