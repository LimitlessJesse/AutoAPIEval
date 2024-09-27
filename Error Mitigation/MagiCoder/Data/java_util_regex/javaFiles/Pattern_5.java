import java.util.regex.Pattern;

public class Pattern_5 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(":");
        String[] result = pattern.split("boo:and:foo", 5);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
