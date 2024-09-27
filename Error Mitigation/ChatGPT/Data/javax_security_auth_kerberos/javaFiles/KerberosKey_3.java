import javax.security.auth.kerberos.KerberosKey;

public class KerberosKey_3 {
    public static void main(String[] args) {
        KerberosKey kerberosKey = new KerberosKey();
        String algorithm = kerberosKey.getAlgorithm();
        System.out.println("Algorithm associated with this key: " + algorithm);
    }
}
