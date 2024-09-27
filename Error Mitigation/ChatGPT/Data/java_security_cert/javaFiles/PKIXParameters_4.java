import java.security.cert.PKIXParameters;

public class PKIXParameters_4 {
    public static void main(String[] args) {
        PKIXParameters params = new PKIXParameters();
        params.setRevocationEnabled(true);
        System.out.println("RevocationEnabled flag set to: " + params.isRevocationEnabled());
    }
}
