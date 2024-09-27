import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_4 {
    public static void main(String[] args) {
        String text = "Hello World";
        Pattern pattern = Pattern.compile("\\bHello\\b");
        Matcher matcher = pattern.matcher(text);
        
        boolean found = matcher.find();
        System.out.println("Pattern found: " + found);
    }
}
