import java.util.SplittableRandom;

public class SplittableRandom_4 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        int randomInt = random.nextInt();
        System.out.println("Generated random int: " + randomInt);
    }
}
