import javax.sql.rowset.serial.SQLInputImpl;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class SQLInputImpl_12 {
    public static void main(String[] args) {
        try {
            SQLInputImpl input = new SQLInputImpl(new ByteArrayInputStream());
            short value = input.readShort();
            System.out.println("The read short value is: " + value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
