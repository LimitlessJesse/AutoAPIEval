import java.io.IOException;
import java.io.ObjectOutput;
import java.rmi.server.ObjID;
import java.rmi.server.UID;

public class ObjID_4 {
    public static void main(String[] args) {
        ObjID objID = new ObjID();
        
        try {
            ObjectOutput out = null; // Initialize ObjectOutput instance
            objID.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
