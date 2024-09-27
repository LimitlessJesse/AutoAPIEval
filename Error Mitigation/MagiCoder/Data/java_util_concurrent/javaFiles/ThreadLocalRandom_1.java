import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandom_1 {
    public static void main(String[] args) {
        int randomInt = ThreadLocalRandom.current().nextInt();
        System.out.println("Random int: " + randomInt);
    }
}
