import java.nio.charset.CoderResult;

public class CoderResult_3 {
    public static void main(String[] args) {
        CoderResult coderResult = CoderResult.malformedForLength(1);
        System.out.println(coderResult.isError()); // Output: true
    }
}
