import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Pattern_5 {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String pattern = "\\b\\w{5}\\b"; // pattern to match words with 5 characters
        
        Pattern r = Pattern.compile(pattern);
        Matcher matcher = r.matcher(text);
        
        while (matcher.find()) {
            System.out.println("Found match: " + matcher.group());
        }
    }
}
