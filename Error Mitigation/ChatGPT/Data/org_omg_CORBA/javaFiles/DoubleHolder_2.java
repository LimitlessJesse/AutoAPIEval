import org.omg.CORBA.DoubleHolder;
import org.omg.CORBA_2_3.portable.OutputStream;

public class DoubleHolder_2 {
    public static void main(String[] args) {
        DoubleHolder holder = new DoubleHolder(3.14);
        OutputStream output = new OutputStream();
        holder._write(output);
    }
}
