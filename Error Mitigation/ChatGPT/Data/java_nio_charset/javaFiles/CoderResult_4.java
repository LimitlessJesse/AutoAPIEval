import java.nio.charset.CoderResult;

public class CoderResult_4 {
    public static void main(String[] args) {
        CoderResult coderResult = CoderResult.malformedForLength(5);
        boolean malformed = coderResult.isMalformed();
        System.out.println("Is Malformed: " + malformed);
    }
}
