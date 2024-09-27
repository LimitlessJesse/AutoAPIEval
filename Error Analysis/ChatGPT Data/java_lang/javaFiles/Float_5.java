public class Float_5 {
    public static void main(String[] args) {
        float num1 = Float.POSITIVE_INFINITY;
        float num2 = Float.NEGATIVE_INFINITY;

        System.out.println(Float.isInfinite(num1)); // true
        System.out.println(Float.isInfinite(num2)); // true
    }
}
