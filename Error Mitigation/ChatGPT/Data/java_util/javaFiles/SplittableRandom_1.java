import java.util.SplittableRandom;

public class SplittableRandom_1 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        int bound = 10;
        int randomNumber = random.nextInt(bound);
        System.out.println("Random number between 0 and " + bound + ": " + randomNumber);
    }
}
