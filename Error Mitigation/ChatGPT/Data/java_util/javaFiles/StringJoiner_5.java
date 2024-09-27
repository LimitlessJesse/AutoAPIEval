import java.util.StringJoiner;

public class StringJoiner_5 {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(",");
        sj1.add("Apple");
        sj1.add("Banana");

        StringJoiner sj2 = new StringJoiner(",");
        sj2.add("Orange");
        sj2.add("Grapes");

        System.out.println("StringJoiner 1: " + sj1.toString());
        System.out.println("StringJoiner 2: " + sj2.toString());

        sj1.merge(sj2);

        System.out.println("Merged StringJoiner: " + sj1.toString());
    }
}
