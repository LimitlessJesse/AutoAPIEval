import javax.crypto.MacSpi;

public class MacSpi_2 {
    public static void main(String[] args) {
        byte input = 65; // Example input byte
        MacSpi macSpi = new MacSpi() {
            @Override
            protected void engineUpdate(byte input) {
                // Process the input byte
                System.out.println("Processing input byte: " + input);
            }
        };
        
        macSpi.engineUpdate(input);
    }
}
