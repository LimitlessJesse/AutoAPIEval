import java.security.AlgorithmParametersSpi;
import java.util.Arrays;

public class AlgorithmParametersSpi_2 {
    public static void main(String[] args) {
        AlgorithmParametersSpi algorithmParameters = new AlgorithmParametersSpi() {
            @Override
            protected byte[] engineGetEncoded() {
                // Add your implementation here
                return new byte[0];
            }
        };

        byte[] encoded = algorithmParameters.engineGetEncoded();
        System.out.println(Arrays.toString(encoded));
    }
}
