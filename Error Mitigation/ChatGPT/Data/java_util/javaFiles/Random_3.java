import java.util.Random;

public class Random_3 {
    public static void main(String[] args) {
        Random random = new Random();
        float randomFloat = random.nextFloat();
        System.out.println("Random float value between 0.0 and 1.0: " + randomFloat);
    }
}
