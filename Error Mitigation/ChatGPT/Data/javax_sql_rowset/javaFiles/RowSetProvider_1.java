import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSetProvider_1 {
    public static void main(String[] args) {
        try {
            RowSetFactory factory = RowSetProvider.newFactory();
            System.out.println("RowSetFactory implementation loaded successfully: " + factory.getClass().getName());
        } catch (SQLException e) {
            System.out.println("Error loading RowSetFactory implementation: " + e.getMessage());
        }
    }
}
