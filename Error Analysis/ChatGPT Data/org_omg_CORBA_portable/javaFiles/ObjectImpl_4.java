import org.omg.CORBA.portable.ObjectImpl;

public class ObjectImpl_4 {
    public static void main(String[] args) {
        // Create an instance of ObjectImpl
        ObjectImpl obj = new ObjectImpl();

        // Instantiate a Delegate object
        Delegate delegate = new Delegate();

        // Call the _set_delegate method
        obj._set_delegate(delegate);
    }
}
