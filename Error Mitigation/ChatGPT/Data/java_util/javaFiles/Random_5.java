import java.util.Random;

public class Random_5 {
    public static void main(String[] args) {
        Random random = new Random();
        long seed = 123456789L;
        random.setSeed(seed);
        System.out.println("Seed set successfully.");
    }
}
