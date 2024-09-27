import org.omg.CORBA.FixedHolder;
import org.omg.CORBA.portable.OutputStream;

public class FixedHolder_2 {
    public static void main(String[] args) {
        FixedHolder fixedHolder = new FixedHolder();
        fixedHolder._write(new OutputStream());
    }
}
