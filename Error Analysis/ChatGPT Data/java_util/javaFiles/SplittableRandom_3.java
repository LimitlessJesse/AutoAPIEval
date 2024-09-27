import java.util.SplittableRandom;

public class SplittableRandom_3 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        
        long randomNumber = random.nextLong();
        
        System.out.println("Random long number: " + randomNumber);
    }
}
