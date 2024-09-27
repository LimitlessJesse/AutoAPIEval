import java.util.SplittableRandom;

public class SplittableRandom_5 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        SplittableRandom splitRandom = random.split();
        System.out.println(random.nextDouble());
        System.out.println(splitRandom.nextDouble());
    }
}
