import java.util.Random;

public class Random_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int bound = 10;
        int randomNumber = random.nextInt(bound);
        System.out.println("Random number between 0 and " + bound + ": " + randomNumber);
    }
}
