import javax.crypto.spec.RC5ParameterSpec;

public class RC5ParameterSpec_3 {
    public static void main(String[] args) {
        byte[] iv = new byte[16]; // Example IV array
        RC5ParameterSpec rc5ParamSpec = new RC5ParameterSpec(32, 16, 8, iv);
        
        byte[] retrievedIV = rc5ParamSpec.getIV();
        if (retrievedIV != null) {
            System.out.println("Retrieved IV: " + new String(retrievedIV));
        } else {
            System.out.println("IV is null in this parameter set.");
        }
    }
}
