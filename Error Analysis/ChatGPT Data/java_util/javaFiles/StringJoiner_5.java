import java.util.StringJoiner;

public class StringJoiner_5 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",");
        sj.add("John").add("Doe").add("Jane");
        System.out.println(sj.toString());

        StringJoiner sjEmpty = new StringJoiner(",");
        sjEmpty.setEmptyValue("No names listed");
        System.out.println(sjEmpty.toString());
    }
}
