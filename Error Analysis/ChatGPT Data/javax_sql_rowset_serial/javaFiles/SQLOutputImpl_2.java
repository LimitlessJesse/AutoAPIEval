import javax.sql.rowset.serial.SQLOutputImpl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class SQLOutputImpl_2 {
    public static void main(String[] args) {
        try {
            SQLOutputImpl sqlOutput = new SQLOutputImpl();
            sqlOutput.writeByte((byte) 65);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            sqlOutput.writeTo(outputStream);
            byte[] byteArray = outputStream.toByteArray();
            System.out.println("Byte array: " + byteArray[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
