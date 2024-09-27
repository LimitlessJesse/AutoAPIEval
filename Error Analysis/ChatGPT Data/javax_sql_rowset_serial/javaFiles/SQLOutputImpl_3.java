import javax.sql.rowset.serial.SQLOutputImpl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class SQLOutputImpl_3 {
    public static void main(String[] args) {
        byte[] byteArray = {65, 66, 67, 68, 69}; // Example byte array

        SQLOutputImpl sqlOutput = new SQLOutputImpl();
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            sqlOutput.writeBytes(byteArray);
            sqlOutput.writeTo(outputStream);

            byte[] outputByteArray = outputStream.toByteArray();
            System.out.println("Byte array after writing: " + new String(outputByteArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
