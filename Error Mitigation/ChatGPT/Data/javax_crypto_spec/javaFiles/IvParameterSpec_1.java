import javax.crypto.spec.IvParameterSpec;

public class IvParameterSpec_1 {
    public static void main(String[] args) {
        byte[] iv = new byte[16]; // Example initialization vector
        IvParameterSpec ivSpec = new IvParameterSpec(iv);
        
        byte[] returnedIV = ivSpec.getIV();
        System.out.println("Returned IV: " + returnedIV);
    }
}
