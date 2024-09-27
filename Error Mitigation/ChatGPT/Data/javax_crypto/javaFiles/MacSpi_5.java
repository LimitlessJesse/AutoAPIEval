import javax.crypto.MacSpi;

public class MacSpi_5 {
    public static void main(String[] args) {
        MyMacSpi myMacSpi = new MyMacSpi();
        int macLength = myMacSpi.engineGetMacLength();
        System.out.println("MAC Length: " + macLength);
    }

    static class MyMacSpi extends MacSpi {
        @Override
        protected int engineGetMacLength() {
            return 16; // Example value, replace with actual implementation
        }
    }
}
