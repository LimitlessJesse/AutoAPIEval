import java.util.StringJoiner;

public class StringJoiner_4 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",");
        sj.add("John");
        sj.add("Doe");
        sj.add("Jane");
        
        System.out.println(sj.toString());
    }
}
