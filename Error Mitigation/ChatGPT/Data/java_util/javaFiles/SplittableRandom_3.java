import java.util.SplittableRandom;

public class SplittableRandom_3 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        double randomValue = random.nextDouble();
        System.out.println("Random double value: " + randomValue);
    }
}
