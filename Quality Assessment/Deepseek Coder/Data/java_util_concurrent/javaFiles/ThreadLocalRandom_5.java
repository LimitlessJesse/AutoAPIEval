import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandom_5 {
    public static void main(String[] args) {
        float randomFloat = ThreadLocalRandom.current().nextFloat();
        System.out.println(randomFloat);
    }
}
