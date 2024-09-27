import javax.sql.rowset.serial.SQLOutputImpl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class SQLOutputImpl_1 {
    public static void main(String[] args) {
        SQLOutputImpl sqlOutput = new SQLOutputImpl();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            sqlOutput.writeBoolean(true);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            System.out.println("Data written: " + new String(byteArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
