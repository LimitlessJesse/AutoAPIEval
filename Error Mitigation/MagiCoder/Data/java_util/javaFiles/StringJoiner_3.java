import java.util.StringJoiner;

public class StringJoiner_3 {
    public static void main(String[] args) {
        StringJoiner joiner1 = new StringJoiner(", ", "{", "}");
        joiner1.add("A");
        joiner1.add("B");
        joiner1.add("C");

        StringJoiner joiner2 = new StringJoiner(", ", "{", "}");
        joiner2.add("D");
        joiner2.add("E");
        joiner2.add("F");

        System.out.println("Joiner 1: " + joiner1);
        System.out.println("Joiner 2: " + joiner2);

        joiner1.merge(joiner2);

        System.out.println("After merge: " + joiner1);
    }
}
