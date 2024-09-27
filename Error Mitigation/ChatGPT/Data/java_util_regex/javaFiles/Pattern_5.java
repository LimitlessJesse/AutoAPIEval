import java.util.regex.Pattern;

public class Pattern_5 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(":");
        String input = "boo:and:foo";
        String[] result = pattern.split(input);
        
        for (String str : result) {
            System.out.println(str);
        }
    }
}
