import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA_2_3.portable.OutputStreamHelper;

public class OutputStream_11 {
    public static void main(String[] args) {
        OutputStream os = OutputStreamHelper.instantiate();
        long l = 1234567890123456L;
        os.write_ulonglong(l);
    }
}
