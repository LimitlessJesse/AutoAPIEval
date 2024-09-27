import java.util.regex.Pattern;

public class Pattern_3 {
    public static void main(String[] args) {
        // Compile a regular expression
        Pattern pattern = Pattern.compile("\\d+");

        // Get the pattern string
        String patternString = pattern.pattern();

        // Print the pattern string
        System.out.println("Pattern: " + patternString);
    }
}
