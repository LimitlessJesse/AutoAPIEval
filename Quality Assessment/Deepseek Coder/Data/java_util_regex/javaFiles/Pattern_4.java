import java.util.regex.Pattern;

public class Pattern_4 {
    public static void main(String[] args) {
        String input = "This is a test string";
        String[] result = Pattern.compile(" ").split(input);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
