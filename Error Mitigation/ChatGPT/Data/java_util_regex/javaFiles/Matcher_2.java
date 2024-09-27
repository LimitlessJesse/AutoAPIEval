import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_2 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        Pattern pattern = Pattern.compile("\\bHello\\b");
        Matcher matcher = pattern.matcher(text);
        
        if (matcher.find()) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found!");
        }
    }
}
