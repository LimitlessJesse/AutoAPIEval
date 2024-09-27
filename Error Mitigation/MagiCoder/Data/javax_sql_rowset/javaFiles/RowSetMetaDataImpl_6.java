import javax.sql.rowset.RowSetMetaDataImpl;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class RowSetMetaDataImpl_6 {
    public static void main(String[] args) {
        try {
            // Create a mock ResultSetMetaData
            ResultSetMetaData metaData = new RowSetMetaDataImpl();

            // Set the scale for a column
            metaData.setScale(1, 2);

            // Get the scale for the column
            int scale = metaData.getScale(1);

            System.out.println("Scale for column 1: " + scale);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
