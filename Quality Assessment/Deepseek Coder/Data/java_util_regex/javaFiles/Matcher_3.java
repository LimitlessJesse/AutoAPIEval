import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_3 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(input);
        
        if (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        } else {
            System.out.println("Not found");
        }
    }
}
