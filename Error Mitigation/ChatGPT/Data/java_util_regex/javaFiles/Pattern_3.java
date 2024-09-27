import java.util.regex.Pattern;

public class Pattern_3 {
    public static void main(String[] args) {
        String regex = "ab+c";
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Pattern compiled successfully: " + pattern);
    }
}
