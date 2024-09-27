import java.util.StringJoiner;

public class StringJoiner_2 {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(",");
        sj1.add("Apple");
        sj1.add("Banana");

        StringJoiner sj2 = new StringJoiner(",");
        sj2.add("Orange");

        StringJoiner merged = sj1.merge(sj2);
        System.out.println(merged.toString()); // Output: Apple,Banana,Orange
    }
}
