import java.lang.Integer;

public class Integer_3 {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int result = Integer.remainderUnsigned(dividend, divisor);
        System.out.println("The remainder of " + dividend + " divided by " + divisor + " is " + result);
    }
}
