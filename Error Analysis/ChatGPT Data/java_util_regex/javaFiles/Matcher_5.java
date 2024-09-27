import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_5 {
    public static void main(String[] args) {
        String originalString = "Hello, World! Hello!";
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(originalString);
        
        String replacedString = matcher.replaceAll("Hi");
        System.out.println(replacedString);
    }
}
