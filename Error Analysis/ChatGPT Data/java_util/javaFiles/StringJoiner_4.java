import java.util.StringJoiner;

public class StringJoiner_4 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("-");
        joiner.add("Hello").add("World");
        
        String result = joiner.toString();
        int length = joiner.length();
        
        System.out.println("Joined String: " + result);
        System.out.println("Length of joined String: " + length);
    }
}
