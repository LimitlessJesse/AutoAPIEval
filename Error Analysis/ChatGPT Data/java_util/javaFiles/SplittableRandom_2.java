import java.util.SplittableRandom;

public class SplittableRandom_2 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        double randomDouble = random.nextDouble();
        System.out.println("Random double: " + randomDouble);
    }
}
