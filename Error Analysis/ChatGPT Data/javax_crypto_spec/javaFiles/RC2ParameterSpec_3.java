import javax.crypto.spec.RC2ParameterSpec;

public class RC2ParameterSpec_3 {
    public static void main(String[] args) {
        byte[] iv = new byte[]{0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07};
        int effectiveKeyBits = 128; // specify effective key bits
        RC2ParameterSpec rc2ParamSpec = new RC2ParameterSpec(effectiveKeyBits, iv);
        
        byte[] ivResult = rc2ParamSpec.getIV();
        System.out.println("IV length: " + ivResult.length);
        System.out.print("IV values: ");
        for (byte b : ivResult) {
            System.out.print(b + " ");
        }
    }
}
