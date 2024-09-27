import java.util.Random;

public class Random_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10); // Generates a random integer between 0 (inclusive) and 10 (exclusive)
        System.out.println("Random number: " + randomNumber);
    }
}
