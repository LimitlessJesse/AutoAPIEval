import java.util.StringJoiner;

public class StringJoiner_4 {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.setEmptyValue("No elements");
        System.out.println(joiner.toString());
    }
}
