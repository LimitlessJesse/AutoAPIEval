import javax.crypto.spec.RC5ParameterSpec;

public class RC5ParameterSpec_3 {
    public static void main(String[] args) {
        int version = 1;
        int rounds = 16;
        int wordSize = 64;
        
        byte[] iv = new byte[]{0x01, 0x02, 0x03, 0x04};
        
        RC5ParameterSpec rc5Spec = new RC5ParameterSpec(version, rounds, wordSize, iv);
        
        byte[] retrievedIV = rc5Spec.getIV();
        
        for (byte b : retrievedIV) {
            System.out.print(b + " ");
        }
    }
}
