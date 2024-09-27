import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_4 {
    public static void main(String[] args) {
        // Create a pattern
        Pattern pattern = Pattern.compile("Hello");

        // Create a matcher
        Matcher matcher = pattern.matcher("Hello World");

        // Use the matches() method
        boolean matchFound = matcher.matches();

        // Print the result
        System.out.println("Match found: " + matchFound);
    }
}
