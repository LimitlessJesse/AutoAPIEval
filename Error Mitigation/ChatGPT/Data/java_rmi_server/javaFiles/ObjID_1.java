import java.rmi.server.ObjID;

public class ObjID_1 {
    public static void main(String[] args) {
        ObjID objID = new ObjID();
        int hashCode = objID.hashCode();
        System.out.println("Hash code value for ObjID: " + hashCode);
    }
}
