import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_1 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        
        boolean isMatch = matcher.matches();
        System.out.println("Is there a match? " + isMatch);
    }
}
