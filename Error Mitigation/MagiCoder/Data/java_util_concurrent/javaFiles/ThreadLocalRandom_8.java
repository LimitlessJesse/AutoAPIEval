import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandom_8 {
    public static void main(String[] args) {
        double origin = 1.0;
        double bound = 10.0;
        double randomDouble = ThreadLocalRandom.current().nextDouble(origin, bound);
        System.out.println("Random double between " + origin + " and " + bound + ": " + randomDouble);
    }
}
