import java.lang.Integer;

public class Integer_3 {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 2;
        int result = Integer.divideUnsigned(dividend, divisor);
        System.out.println("The unsigned quotient is: " + result);
    }
}
