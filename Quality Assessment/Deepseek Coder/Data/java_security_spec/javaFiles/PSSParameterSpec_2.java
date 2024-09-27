import java.security.spec.PSSParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PSSParameterSpec_2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        MGF1ParameterSpec spec = new MGF1ParameterSpec("SHA-256");
        PSSParameterSpec pssSpec = new PSSParameterSpec(md.getDigestLength(), "SHA-256", spec);
        System.out.println(pssSpec.getMGFAlgorithm());
    }
}
