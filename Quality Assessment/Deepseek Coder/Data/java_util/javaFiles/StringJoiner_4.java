import java.util.StringJoiner;

public class StringJoiner_4 {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(", ", "{", "}");
        sj1.add("John").add("Anna").add("Mike");

        StringJoiner sj2 = new StringJoiner(": ", "{", "}");
        sj2.add("Peter").add("Linda");

        System.out.println(sj1.merge(sj2).toString());
    }
}
