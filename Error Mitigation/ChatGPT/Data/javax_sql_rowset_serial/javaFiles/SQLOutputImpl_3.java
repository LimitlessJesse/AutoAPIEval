import javax.sql.rowset.serial.SQLOutputImpl;
import java.math.BigDecimal;
import java.sql.SQLException;

public class SQLOutputImpl_3 {
    public static void main(String[] args) {
        SQLOutputImpl sqlOutput = new SQLOutputImpl();
        BigDecimal value = new BigDecimal("123.45");
        
        try {
            sqlOutput.writeBigDecimal(value);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
