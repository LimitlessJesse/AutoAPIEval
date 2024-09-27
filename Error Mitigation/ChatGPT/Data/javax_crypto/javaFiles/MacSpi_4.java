import javax.crypto.MacSpi;

public class MacSpi_4 {
    public static void main(String[] args) {
        // Create an instance of a class that extends MacSpi
        MacSpi macSpi = new CustomMacSpi();
        
        // Call the engineDoFinal method
        byte[] result = macSpi.engineDoFinal();
        
        // Print the MAC result
        System.out.println("MAC Result: " + result);
    }
}

class CustomMacSpi extends MacSpi {
    @Override
    protected byte[] engineDoFinal() {
        // Implement the MAC computation and return the result
        byte[] result = new byte[]{0x01, 0x02, 0x03};
        return result;
    }
}
