import java.rmi.server.ObjID;

public class ObjID_5 {
    public static void main(String[] args) {
        ObjID obj1 = new ObjID(1);
        ObjID obj2 = new ObjID(2);
        
        boolean isEqual = obj1.equals(obj2);
        System.out.println("Are obj1 and obj2 equal? " + isEqual);
    }
}
