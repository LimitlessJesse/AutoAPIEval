import java.util.regex.Pattern;

public class Pattern_1 {
    public static void main(String[] args) {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        System.out.println(pattern);
    }
}
