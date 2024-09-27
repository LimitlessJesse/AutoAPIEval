import java.util.regex.Pattern;

public class Pattern_4 {
    public static void main(String[] args) {
        String regex = ":";
        String input = "boo:and:foo";
        Pattern pattern = Pattern.compile(regex);
        String[] result = pattern.split(input);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
