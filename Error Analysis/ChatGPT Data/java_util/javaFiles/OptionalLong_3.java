import java.util.OptionalLong;

public class OptionalLong_3 {
    public static void main(String[] args) {
        OptionalLong op1 = OptionalLong.of(10);
        OptionalLong op2 = OptionalLong.empty();

        long result1 = op1.orElse(0);
        long result2 = op2.orElse(5);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
