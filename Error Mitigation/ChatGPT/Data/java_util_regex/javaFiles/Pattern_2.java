import java.util.regex.Pattern;

public class Pattern_2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z]+");
        System.out.println("Pattern: " + pattern.pattern());
    }
}
