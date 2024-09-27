import javax.crypto.spec.PBEParameterSpec;

public class PBEParameterSpec_2 {
    public static void main(String[] args) {
        PBEParameterSpec pbeParamSpec = new PBEParameterSpec(new byte[8], 100);
        byte[] salt = pbeParamSpec.getSalt();
        System.out.println("Salt: " + new String(salt));
    }
}
