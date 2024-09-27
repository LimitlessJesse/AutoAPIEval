import java.util.Random;

public class Random_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10); // Generates a random number between 0 (inclusive) and 10 (exclusive)
        System.out.println(randomNumber);
    }
}
