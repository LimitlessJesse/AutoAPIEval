import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_3 {
    public static void main(String[] args) {
        String text = "The cat and the dog are playing in the garden";
        String patternString = "\\b\\p{Lower}+\\b";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Match found at index: " + matcher.start());
        }
    }
}
