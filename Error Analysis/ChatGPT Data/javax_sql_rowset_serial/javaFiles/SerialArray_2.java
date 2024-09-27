import javax.sql.rowset.serial.SerialArray;
import java.sql.Array;
import java.sql.SQLException;

public class SerialArray_2 {
    public static void main(String[] args) {
        String[] elements = {"Java", "Python", "C++"};
        Array array = new SerialArray(elements);
        
        try {
            String typeName = array.getBaseTypeName();
            System.out.println("Base type name: " + typeName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
