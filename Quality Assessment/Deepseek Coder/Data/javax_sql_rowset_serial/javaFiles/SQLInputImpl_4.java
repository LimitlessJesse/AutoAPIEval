import javax.sql.rowset.serial.SQLInputImpl;
import java.io.StringReader;
import java.io.IOException;

public class SQLInputImpl_4 {
    public static void main(String[] args) {
        StringReader stringReader = new StringReader("123.456");
        SQLInputImpl sqlInput = new SQLInputImpl(stringReader);

        try {
            double value = sqlInput.readDouble();
            System.out.println("The read double value is: " + value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
