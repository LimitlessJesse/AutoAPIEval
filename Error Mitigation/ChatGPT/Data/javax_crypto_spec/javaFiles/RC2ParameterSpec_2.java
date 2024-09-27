import javax.crypto.spec.RC2ParameterSpec;

public class RC2ParameterSpec_2 {
    public static void main(String[] args) {
        RC2ParameterSpec rc2ParamSpec = new RC2ParameterSpec(128, new byte[]{1, 2, 3, 4, 5});
        byte[] iv = rc2ParamSpec.getIV();
        
        if (iv != null) {
            System.out.println("IV: " + new String(iv));
        } else {
            System.out.println("IV is null");
        }
    }
}
