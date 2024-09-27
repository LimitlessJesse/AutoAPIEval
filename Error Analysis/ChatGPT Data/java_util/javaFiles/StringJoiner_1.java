import java.util.StringJoiner;

public class StringJoiner_1 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("Hello");
        joiner.add("World");
        String result = joiner.toString();
        System.out.println(result); // Output: Hello,World
    }
}
