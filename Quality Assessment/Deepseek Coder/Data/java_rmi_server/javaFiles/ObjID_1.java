import java.rmi.server.ObjID;

public class ObjID_1 {
    public static void main(String[] args) {
        ObjID objId1 = new ObjID();
        ObjID objId2 = new ObjID();

        boolean isEqual = objId1.equals(objId2);

        System.out.println("Are the two object IDs equal? " + isEqual);
    }
}
