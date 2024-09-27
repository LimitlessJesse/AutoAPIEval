import java.util.StringJoiner;

public class StringJoiner_5 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "{", "}");
        sj.add("Hello");
        sj.add("World");
        System.out.println(sj.toString());
    }
}
