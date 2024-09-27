import org.omg.CORBA.portable.Delegate;
import org.omg.CORBA.portable.ObjectImpl;

public class ObjectImpl_2 {
    public static void main(String[] args) {
        ObjectImpl objectImpl = new ObjectImpl();
        Delegate delegate = objectImpl._get_delegate();
        System.out.println("Delegate: " + delegate);
    }
}
