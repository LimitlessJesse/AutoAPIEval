import java.security.cert.PKIXParameters;
import java.security.cert.Certificate;
import java.util.Set;
import java.util.HashSet;

public class PKIXParameters_8 {
    public static void main(String[] args) {
        PKIXParameters params = new PKIXParameters(new HashSet<Certificate>());
        Set<String> unresolved = params.getUnresolvedCriticalExtensionOIDs();
        System.out.println(unresolved.toString());
    }
}
