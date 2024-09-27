import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_1 {
    public static void main(String[] args) {
        String input = "Hello World";
        Pattern pattern = Pattern.compile(".*World.*");
        Matcher matcher = pattern.matcher(input);
        
        boolean isMatch = matcher.matches();
        
        System.out.println("Does input match the pattern? " + isMatch);
    }
}
