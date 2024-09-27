import javax.sql.rowset.serial.SerialArray;
import java.sql.Array;
import java.sql.Connection;
import java.sql.SQLException;

public class SerialArray_1 {
    public static void main(String[] args) {
        Connection connection = null; // Get your connection object here

        try {
            Array array = new SerialArray(connection.createArrayOf("VARCHAR", new Object[]{"Java", "Python", "C++"}));
            Object[] resultArray = array.getArray();

            for (Object obj : resultArray) {
                System.out.println(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
