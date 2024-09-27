import java.io.ObjectInput;
import java.io.IOException;
import java.rmi.server.ObjID;

public class ObjID_3 {
    public static void main(String[] args) {
        // Create an ObjectInput instance (example)
        ObjectInput objectInput = null;
        
        try {
            ObjID objID = ObjID.read(objectInput);
            System.out.println("ObjID read successfully: " + objID);
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
