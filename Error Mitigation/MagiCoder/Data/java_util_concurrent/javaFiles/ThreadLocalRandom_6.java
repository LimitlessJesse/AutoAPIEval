import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandom_6 {
    public static void main(String[] args) {
        int randomNum = ThreadLocalRandom.current().nextInt(10);
        System.out.println("Random number between 0 (inclusive) and 10 (exclusive): " + randomNum);
    }
}
