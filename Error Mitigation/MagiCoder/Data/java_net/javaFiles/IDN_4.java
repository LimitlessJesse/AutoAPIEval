import java.net.IDN;

public class IDN_4 {
    public static void main(String[] args) {
        try {
            String input = "example.com";
            int flag = 0;
            String output = IDN.toASCII(input, flag);
            System.out.println(output);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        }
    }
}
