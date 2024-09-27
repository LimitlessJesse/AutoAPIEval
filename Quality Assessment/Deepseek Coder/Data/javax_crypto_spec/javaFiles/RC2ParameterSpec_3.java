import javax.crypto.spec.RC2ParameterSpec;

public class RC2ParameterSpec_3 {
    public static void main(String[] args) {
        RC2ParameterSpec spec = new RC2ParameterSpec(128, new byte[]{0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08});
        byte[] iv = spec.getIV();
        for (byte b : iv) {
            System.out.format("0x%x ", b);
        }
    }
}
