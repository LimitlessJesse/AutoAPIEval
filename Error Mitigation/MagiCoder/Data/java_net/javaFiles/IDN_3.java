import java.net.IDN;

public class IDN_3 {
    public static void main(String[] args) {
        String input = "example.com";
        int flag = 0;
        String output = IDN.toUnicode(input, flag);
        System.out.println(output);
    }
}
