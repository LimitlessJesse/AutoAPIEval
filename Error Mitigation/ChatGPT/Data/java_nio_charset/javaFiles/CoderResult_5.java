import java.nio.charset.CoderResult;

public class CoderResult_5 {
    public static void main(String[] args) {
        CoderResult coderResult = CoderResult.UNDERFLOW;
        boolean isUnmappable = coderResult.isUnmappable();
        System.out.println("Is Unmappable: " + isUnmappable);
    }
}
