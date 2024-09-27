import javax.security.auth.kerberos.KerberosKey;

public class KerberosKey_2 {
    public static void main(String[] args) {
        // Create a KerberosKey object
        KerberosKey key = new KerberosKey(new byte[]{1, 2, 3}, 1, 1);

        // Get the encoded key as a byte array
        byte[] encodedKey = key.getEncoded();

        // Print the encoded key
        for (byte b : encodedKey) {
            System.out.print(b + " ");
        }
    }
}
