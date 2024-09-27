import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_4 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        
        if (matcher.find()) {
            int startIndex = matcher.start();
            System.out.println("Start index of the match: " + startIndex);
        } else {
            System.out.println("No match found.");
        }
    }
}
