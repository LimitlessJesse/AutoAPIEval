import org.omg.CORBA.portable.OutputStream;

public class OutputStream_2 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream();
        char value = 'A';
        outputStream.write_char(value);
    }
}
