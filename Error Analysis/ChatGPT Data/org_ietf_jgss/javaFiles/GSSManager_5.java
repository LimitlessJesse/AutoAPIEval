import org.ietf.jgss.*;

public class GSSManager_5 {
    public static void main(String[] args) throws GSSException {
        GSSManager manager = GSSManager.getInstance();
        GSSName name = manager.createName("username@EXAMPLE.COM", GSSName.NT_USER_NAME);
        Oid mech = GSSUtil.GSS_KRB5_MECH;
        int lifetime = GSSCredential.DEFAULT_LIFETIME;
        int usage = GSSCredential.ACCEPT_ONLY;

        GSSCredential credential = manager.createCredential(name, lifetime, mech, usage);
        System.out.println("Created credential: " + credential);
    }
}
