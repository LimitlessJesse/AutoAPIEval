import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("12345");
        while (matcher.find()) {
            System.out.println("Group count: " + matcher.groupCount());
        }
    }
}
