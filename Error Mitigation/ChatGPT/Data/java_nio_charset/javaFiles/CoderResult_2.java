import java.nio.charset.CoderResult;

public class CoderResult_2 {
    public static void main(String[] args) {
        CoderResult coderResult = CoderResult.UNDERFLOW;
        boolean result = coderResult.isUnderflow();
        System.out.println("Is underflow: " + result);
    }
}
