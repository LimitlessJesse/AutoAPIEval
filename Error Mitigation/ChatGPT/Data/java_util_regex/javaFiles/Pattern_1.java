import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaaaab");
        System.out.println(matcher.matches());
    }
}
