import org.omg.CORBA.portable.OutputStream;

public class OutputStream_3 {
    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream();
        float value = 3.14f;
        outputStream.write_float(value);
    }
}
