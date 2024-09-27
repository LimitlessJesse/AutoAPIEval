import java.nio.charset.CoderResult;

public class CoderResult_1 {
    public static void main(String[] args) {
        CoderResult result = CoderResult.malformedForLength(5);
        System.out.println(result.toString());
    }
}
