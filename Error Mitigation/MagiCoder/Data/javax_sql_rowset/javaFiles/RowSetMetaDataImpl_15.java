import javax.sql.rowset.RowSetMetaDataImpl;
import java.sql.SQLException;

public class RowSetMetaDataImpl_15 {
    public static void main(String[] args) {
        RowSetMetaDataImpl rowSetMetaData = new RowSetMetaDataImpl();
        try {
            boolean isSearchable = rowSetMetaData.isSearchable(1);
            System.out.println("Is column 1 searchable? " + isSearchable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
