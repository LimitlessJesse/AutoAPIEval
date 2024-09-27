import java.security.AlgorithmParameterGeneratorSpi;
import java.security.SecureRandom;

public class AlgorithmParameterGeneratorSpi_1 {
    public static void main(String[] args) {
        MyAlgorithmParameterGeneratorSpi spi = new MyAlgorithmParameterGeneratorSpi();
        spi.engineInit(128, new SecureRandom());
    }

    static class MyAlgorithmParameterGeneratorSpi extends AlgorithmParameterGeneratorSpi {
        @Override
        protected void engineInit(int size, SecureRandom random) {
            System.out.println("Initializing parameter generator with size: " + size);
        }
    }
}
