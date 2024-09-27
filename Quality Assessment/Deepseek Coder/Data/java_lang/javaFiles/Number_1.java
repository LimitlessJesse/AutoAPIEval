import java.lang.Number;

public class Number_1 {
    public static void main(String[] args) {
        Short s = 127;
        Number n = s;
        byte b = n.byteValue();
        System.out.println(b);
    }
}
