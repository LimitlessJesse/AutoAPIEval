import org.omg.CORBA.portable.Delegate;
import org.omg.CORBA.portable.ObjectImpl;

public class ObjectImpl_1 {
    public static void main(String[] args) {
        ObjectImpl object = new ObjectImpl();
        Delegate delegate = new Delegate();
        object._set_delegate(delegate);
    }
}
