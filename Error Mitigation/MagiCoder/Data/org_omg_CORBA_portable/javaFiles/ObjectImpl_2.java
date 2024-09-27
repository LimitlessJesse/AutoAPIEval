import org.omg.CORBA.portable.ObjectImpl;

public class ObjectImpl_2 {
    public static void main(String[] args) {
        ObjectImpl obj = new ObjectImpl();
        int hashCode = obj.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
