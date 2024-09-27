import java.security.SignatureSpi;
import java.security.InvalidKeyException;
import java.security.SignatureException;

public class SignatureSpi_4 {
    public static void main(String[] args) {
        byte[] input = { 0x01, 0x02, 0x03 };
        int off = 0;
        int len = input.length;
        
        MySignatureSpi mySignature = new MySignatureSpi();
        try {
            mySignature.engineUpdate(input, off, len);
        } catch (InvalidKeyException | SignatureException e) {
            e.printStackTrace();
        }
    }
}

class MySignatureSpi extends SignatureSpi {
    protected void engineUpdate(byte[] input, int off, int len) {
        // implementation of engineUpdate method
        System.out.println("Updating signature with input");
    }
}
