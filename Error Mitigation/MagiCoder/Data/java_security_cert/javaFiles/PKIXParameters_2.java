import java.security.cert.PKIXParameters;

public class PKIXParameters_2 {
    public static void main(String[] args) {
        PKIXParameters pkixParameters = new PKIXParameters();
        pkixParameters.setRevocationEnabled(false);
    }
}
