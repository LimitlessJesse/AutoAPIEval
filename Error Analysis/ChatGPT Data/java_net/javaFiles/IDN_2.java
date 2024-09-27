import java.net.IDN;

public class IDN_2 {
    public static void main(String[] args) {
        String input = "www.россия.рф";
        String unicodeString = IDN.toUnicode(input);
        System.out.println(unicodeString);
    }
}
