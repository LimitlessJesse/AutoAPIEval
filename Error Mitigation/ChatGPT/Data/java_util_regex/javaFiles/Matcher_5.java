import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_5 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        
        if (matcher.find()) {
            int endOffset = matcher.end();
            System.out.println("End offset: " + endOffset);
        } else {
            System.out.println("No match found.");
        }
    }
}
