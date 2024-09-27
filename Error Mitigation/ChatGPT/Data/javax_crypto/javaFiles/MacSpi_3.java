import javax.crypto.MacSpi;

public class MacSpi_3 {
    public static void main(String[] args) {
        // Create a custom MacSpi implementation
        MacSpi customMacSpi = new MacSpi() {
            @Override
            protected void engineReset() {
                // Reset the MAC implementation
                System.out.println("MAC reset");
            }
        };
        
        // Call the engineReset method
        customMacSpi.engineReset();
    }
}
