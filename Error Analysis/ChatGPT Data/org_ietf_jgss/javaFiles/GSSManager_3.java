import org.ietf.jgss.*;

public class GSSManager_3 {
    public static void main(String[] args) {
        GSSManager manager = GSSManager.getInstance();

        String nameStr = "example";
        Oid nameType = GSSName.NT_USER_NAME;

        GSSName name = null;
        try {
            name = manager.createName(nameStr, nameType);
        } catch (GSSException e) {
            e.printStackTrace();
        }

        System.out.println("Created GSSName: " + name.toString());
    }
}
