import javax.crypto.CipherSpi;

public class CipherSpi_5 {
    public static void main(String[] args) {
        MyCipherSpi cipherSpi = new MyCipherSpi();
        cipherSpi.engineSetMode("ECB");
    }

    static class MyCipherSpi extends CipherSpi {
        @Override
        protected void engineSetMode(String mode) {
            System.out.println("Mode set to: " + mode);
        }

        // Other required abstract methods for CipherSpi
        // These methods can be left empty for illustration purposes
        @Override
        protected byte[] engineDoFinal(byte[] input, int inputOffset, int inputLen) {
            return new byte[0];
        }

        @Override
        protected int engineGetBlockSize() {
            return 0;
        }
    }
}
