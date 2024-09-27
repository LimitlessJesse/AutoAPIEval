import java.security.SignatureSpi;

public class SignatureSpi_3 {
    public static void main(String[] args) {
        // Example of using void engineUpdate(byte b) from java.security.SignatureSpi
        byte[] data = "Hello".getBytes();
        SignatureSpi signatureSpi = new CustomSignatureSpi();
        signatureSpi.engineUpdate(data[0]);
    }

    static class CustomSignatureSpi extends SignatureSpi {
        @Override
        protected void engineUpdate(byte b) {
            // Custom implementation
            System.out.println("Updating signature with byte: " + b);
        }

        // Other methods of SignatureSpi should be implemented here
    }
}
