import java.rmi.server.ObjID;

public class ObjID_1 {
    public static void main(String[] args) {
        ObjID objID1 = new ObjID();
        ObjID objID2 = new ObjID();

        System.out.println(objID1.equals(objID2));
    }
}
