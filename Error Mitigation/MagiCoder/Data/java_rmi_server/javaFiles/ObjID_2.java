import java.rmi.server.ObjID;

public class ObjID_2 {
    public static void main(String[] args) {
        ObjID objId = new ObjID();
        int hashCode = objId.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
