import javax.security.auth.kerberos.KerberosKey;

public class KerberosKey_4 {
    public static void main(String[] args) {
        KerberosKey kerberosKey = new KerberosKey();
        int keyType = kerberosKey.getKeyType();
        System.out.println("Key Type: " + keyType);
    }
}
