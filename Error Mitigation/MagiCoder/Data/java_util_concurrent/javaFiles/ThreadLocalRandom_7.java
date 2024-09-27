import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandom_7 {
    public static void main(String[] args) {
        long randomLong = ThreadLocalRandom.current().nextLong(100);
        System.out.println("Random long value: " + randomLong);
    }
}
