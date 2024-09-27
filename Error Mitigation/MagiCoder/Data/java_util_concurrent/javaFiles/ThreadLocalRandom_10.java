import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandom_10 {
    public static void main(String[] args) {
        try {
            ThreadLocalRandom.current().setSeed(123);
        } catch (UnsupportedOperationException e) {
            System.out.println("Setting seeds in this generator is not supported.");
        }
    }
}
