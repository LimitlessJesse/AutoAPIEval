import java.util.SplittableRandom;

public class SplittableRandom_3 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        int randomNumber = random.nextInt(100); // Generates a random number between 0 (inclusive) and 100 (exclusive)
        System.out.println("Random number: " + randomNumber);
    }
}
