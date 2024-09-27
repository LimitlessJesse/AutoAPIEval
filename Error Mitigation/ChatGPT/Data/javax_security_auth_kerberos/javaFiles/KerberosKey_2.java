import javax.security.auth.kerberos.KerberosKey;

public class KerberosKey_2 {
    public static void main(String[] args) {
        // Create a KerberosKey object
        KerberosKey kerberosKey = new KerberosKey();

        // Get the encoded key material
        byte[] encodedKey = kerberosKey.getEncoded();

        // Print the encoded key material
        System.out.println("Encoded key material: " + encodedKey);
    }
}
