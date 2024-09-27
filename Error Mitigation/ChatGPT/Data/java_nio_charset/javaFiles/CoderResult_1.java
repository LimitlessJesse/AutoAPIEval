import java.nio.charset.CoderResult;

public class CoderResult_1 {
    public static void main(String[] args) {
        CoderResult coderResult = CoderResult.OVERFLOW;
        System.out.println(coderResult.isOverflow()); // Output: true
    }
}
