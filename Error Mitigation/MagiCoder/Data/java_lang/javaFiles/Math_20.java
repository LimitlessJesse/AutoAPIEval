import java.lang.Math;

public class Math_20 {
    public static void main(String[] args) {
        double magnitude = 10.0;
        double sign = -2.0;
        double result = Math.copySign(magnitude, sign);
        System.out.println("The result is: " + result);
    }
}
