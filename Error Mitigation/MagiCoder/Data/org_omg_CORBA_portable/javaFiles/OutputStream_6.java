import org.omg.CORBA.portable.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class OutputStream_6 {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);

        try {
            dataOutputStream.writeFloat(1.23f);
            byte[] bytes = byteArrayOutputStream.toByteArray();
            System.out.println(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
