import java.util.Random;

public class Random_4 {
    public static void main(String[] args) {
        Random random = new Random();
        double gaussianValue = random.nextGaussian();
        System.out.println("Random Gaussian value: " + gaussianValue);
    }
}
