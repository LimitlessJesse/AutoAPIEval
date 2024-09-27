import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_2 {
    public static void main(String[] args) {
        String text = "Hello 123 World";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        
        while (matcher.find()) {
            String num = matcher.group();
            System.out.println(num);
        }
    }
}
