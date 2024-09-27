import java.security.cert.PKIXParameters;

public class PKIXParameters_5 {
    public static void main(String[] args) {
        PKIXParameters params = new PKIXParameters();
        params.setSigProvider("MySignatureProvider");
    }
}
