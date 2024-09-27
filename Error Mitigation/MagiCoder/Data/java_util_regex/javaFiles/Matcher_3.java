import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_3 {
    public static void main(String[] args) {
        String text = "Hello, world! This is a test.";
        String patternString = "test";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        boolean found = matcher.find();
        System.out.println("Found: " + found);
    }
}
