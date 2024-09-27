import java.net.IDN;

public class IDN_1 {
    public static void main(String[] args) {
        String input = "例子.com";
        String ascii = IDN.toASCII(input);
        System.out.println(ascii);
    }
}
