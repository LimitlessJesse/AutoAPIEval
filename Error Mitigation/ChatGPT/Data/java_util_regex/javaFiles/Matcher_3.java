import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_3 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        
        if (matcher.find()) {
            String matchedText = matcher.group();
            System.out.println("Matched text: " + matchedText);
        }
    }
}
