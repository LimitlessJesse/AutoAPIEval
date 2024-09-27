import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Pattern_2 {
    public static void main(String[] args) {
        // Create a pattern
        Pattern pattern = Pattern.compile("Hello");
        
        // Create a matcher
        Matcher matcher = pattern.matcher("Hello World");
        
        // Use the matcher
        while (matcher.find()) {
            System.out.println("Found match: " + matcher.group());
        }
    }
}
