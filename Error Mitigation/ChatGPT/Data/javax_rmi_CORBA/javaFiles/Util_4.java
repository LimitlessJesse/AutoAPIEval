import javax.rmi.CORBA.Util;
import org.omg.CORBA_2_3.portable.OutputStream;

public class Util_4 {
    public static void main(String[] args) {
        OutputStream out = new OutputStream();
        Object obj = new Object();
        
        Util.writeAny(out, obj);
    }
}
