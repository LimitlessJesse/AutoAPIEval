import java.util.SplittableRandom;

public class SplittableRandom_2 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        double randomNumber = random.nextDouble(5, 10);
        System.out.println(randomNumber);
    }
}
