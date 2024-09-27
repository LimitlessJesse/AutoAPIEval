import java.net.IDN;

public class IDN_2 {
    public static void main(String[] args) {
        String input = "xn--fsq.example.com";
        String unicode = IDN.toUnicode(input);
        System.out.println(unicode);
    }
}
