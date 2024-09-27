import java.lang.Float;

public class Float_4 {
    public static void main(String[] args) {
        float number = Float.NaN;
        boolean result = Float.isNaN(number);
        System.out.println("Is NaN: " + result);
    }
}
