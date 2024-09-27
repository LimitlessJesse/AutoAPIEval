import java.lang.Math;

public class Math_2 {
    public static void main(String[] args) {
        double a = 10.4;
        double b = -10.4;
        double c = 0.0;
        double d = -0.0;
        double e = Double.NaN;
        double f = Double.POSITIVE_INFINITY;
        double g = Double.NEGATIVE_INFINITY;

        System.out.println("Math.ceil(10.4) = " + Math.ceil(a));
        System.out.println("Math.ceil(-10.4) = " + Math.ceil(b));
        System.out.println("Math.ceil(0.0) = " + Math.ceil(c));
        System.out.println("Math.ceil(-0.0) = " + Math.ceil(d));
        System.out.println("Math.ceil(NaN) = " + Math.ceil(e));
        System.out.println("Math.ceil(Infinity) = " + Math.ceil(f));
        System.out.println("Math.ceil(-Infinity) = " + Math.ceil(g));
    }
}
