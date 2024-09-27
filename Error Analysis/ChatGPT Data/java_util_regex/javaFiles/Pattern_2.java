import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_2 {
    public static void main(String[] args) {
        String text = "Java is a programming language";
        Pattern pattern = Pattern.compile("language");
        Matcher matcher = pattern.matcher(text);
        
        if(matcher.find()) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found.");
        }
    }
}
