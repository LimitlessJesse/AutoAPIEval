import java.net.IDN;

public class IDN_1 {
    public static void main(String[] args) {
        String input = "example.com";
        String output = IDN.toASCII(input);
        System.out.println(output);
    }
}
