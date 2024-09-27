import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_1 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Pattern pattern = Pattern.compile("World");
        Matcher matcher = pattern.matcher(text);
        
        if (matcher.find()) {
            int start = matcher.start();
            System.out.println("The start index of the match is: " + start);
        }
    }
}
