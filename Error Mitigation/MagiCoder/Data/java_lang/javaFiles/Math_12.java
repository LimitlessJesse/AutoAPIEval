import java.lang.Math;

public class Math_12 {
    public static void main(String[] args) {
        double a = 45; // in degrees
        double radians = Math.toRadians(a); // convert to radians
        double result = Math.tan(radians);
        System.out.println("The tangent of " + a + " degrees is " + result);
    }
}
