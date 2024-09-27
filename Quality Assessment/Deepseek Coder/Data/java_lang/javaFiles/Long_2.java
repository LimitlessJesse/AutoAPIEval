import java.lang.Long;

public class Long_2 {
    public static void main(String[] args) {
        String s = "10101101101001101001011010011010";
        int radix = 2; // binary
        long l = Long.parseLong(s, radix);
        System.out.println(l);
    }
}
