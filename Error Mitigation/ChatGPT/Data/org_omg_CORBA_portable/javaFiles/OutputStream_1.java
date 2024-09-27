import org.omg.CORBA.portable.OutputStream;

public class OutputStream_1 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream();
        boolean value = true;
        outputStream.write_boolean(value);
    }
}
