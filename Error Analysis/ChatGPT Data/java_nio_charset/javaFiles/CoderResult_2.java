import java.nio.charset.*;

public class CoderResult_2 {
    public static void main(String[] args) {
        CoderResult result = CoderResult.unmappableForLength(5);
        System.out.println(result.toString());
    }
}
