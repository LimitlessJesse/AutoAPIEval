import java.util.StringJoiner;

public class StringJoiner_3 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",");
        sj.add("John");
        sj.add("Doe");
        
        System.out.println("Length of StringJoiner: " + sj.length());
    }
}
