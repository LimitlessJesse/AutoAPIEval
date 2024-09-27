import java.lang.Float;

public class Float_2 {
    public static void main(String[] args) {
        int bits = 0x7f800000;
        float result = Float.intBitsToFloat(bits);
        System.out.println(result);
    }
}
