import java.util.Random;

public class Random_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10); // generates a random integer between 0 and 9
        System.out.println("Random Number: " + randomNumber);
    }
}
