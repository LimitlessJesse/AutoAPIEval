import java.util.SplittableRandom;

public class SplittableRandom_1 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        long randomLong = random.nextLong(100); // Generate a random long number between 0 (inclusive) and 100 (exclusive)
        System.out.println(randomLong);
    }
}
