import javax.sql.rowset.serial.SQLInputImpl;
import java.math.BigDecimal;
import java.sql.SQLException;

public class SQLInputImpl_3 {
    public static void main(String[] args) {
        SQLInputImpl sqlInput = new SQLInputImpl();
        try {
            BigDecimal result = sqlInput.readBigDecimal();
            System.out.println("Result: " + result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
