import javax.sql.rowset.serial.SQLInputImpl;
import java.io.StringReader;
import java.io.IOException;

public class SQLInputImpl_5 {
    public static void main(String[] args) {
        String input = "123.45";
        StringReader stringReader = new StringReader(input);
        SQLInputImpl sqlInput = new SQLInputImpl(stringReader);

        try {
            float floatValue = sqlInput.readFloat();
            System.out.println("Float value: " + floatValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
