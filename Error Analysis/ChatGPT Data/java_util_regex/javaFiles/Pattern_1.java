import java.util.regex.Pattern;

public class Pattern_1 {
    public static void main(String[] args) {
        String text = "This is a sample text";
        Pattern pattern = Pattern.compile("\\b\\w{4}\\b");
        System.out.println("Regex pattern: " + pattern.pattern());
    }
}
