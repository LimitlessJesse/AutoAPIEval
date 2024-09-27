import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_2 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input);
        
        if (matcher.find()) {
            System.out.println("Matched text: " + input.substring(matcher.start(), matcher.end()));
        }
    }
}
