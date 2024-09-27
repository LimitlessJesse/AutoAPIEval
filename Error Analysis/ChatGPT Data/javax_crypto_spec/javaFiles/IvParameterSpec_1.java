import javax.crypto.spec.IvParameterSpec;

public class IvParameterSpec_1 {
    public static void main(String[] args) {
        byte[] initializationVector = new byte[]{0, 1, 2, 3, 4, 5, 6, 7};
        IvParameterSpec ivSpec = new IvParameterSpec(initializationVector);
        
        byte[] iv = ivSpec.getIV();
        System.out.println("Initialization Vector: " + java.util.Arrays.toString(iv));
    }
}
