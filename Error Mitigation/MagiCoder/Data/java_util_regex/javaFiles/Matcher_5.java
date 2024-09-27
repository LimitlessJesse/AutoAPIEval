import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_5 {
    public static void main(String[] args) {
        String regex = "foo";
        String input = "foobar";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean matchFound = matcher.lookingAt();

        System.out.println("Match found: " + matchFound);
    }
}
