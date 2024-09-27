import java.nio.charset.CoderResult;

public class CoderResult_2 {
    public static void main(String[] args) {
        CoderResult coderResult = CoderResult.OVERFLOW;
        boolean isMalformed = coderResult.isMalformed();
        System.out.println("Is malformed: " + isMalformed);
    }
}
