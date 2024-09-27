import java.lang.Float;

public class Float_1 {
    public static void main(String[] args) {
        Float float1 = new Float(10.5f);
        Float float2 = new Float(5.5f);

        int result = float1.compareTo(float2);
        System.out.println("Comparison result: " + result);
    }
}
