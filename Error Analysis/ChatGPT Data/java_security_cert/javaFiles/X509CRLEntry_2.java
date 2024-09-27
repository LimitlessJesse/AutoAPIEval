import java.math.BigInteger;
import java.security.cert.X509CRLEntry;

public class X509CRLEntry_2 {
    public static void main(String[] args) {
        X509CRLEntry crlEntry = null; // initialize X509CRLEntry object here
        
        BigInteger serialNumber = crlEntry.getSerialNumber();
        System.out.println("Serial Number: " + serialNumber);
    }
}
