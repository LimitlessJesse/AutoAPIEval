import java.rmi.server.ObjID;

public class ObjID_2 {
    public static void main(String[] args) {
        ObjID objID1 = new ObjID(1);
        ObjID objID2 = new ObjID(1);
        
        System.out.println("objID1 equals objID2: " + objID1.equals(objID2)); // Should print true
    }
}
