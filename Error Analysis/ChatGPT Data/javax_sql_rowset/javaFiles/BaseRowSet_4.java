import javax.sql.rowset.BaseRowSet;

public class BaseRowSet_4 {
    public static void main(String[] args) {
        BaseRowSet rowSet = new BaseRowSet(); // Instantiate the BaseRowSet
        int type = rowSet.getType(); // Get the type of the RowSet
        System.out.println("RowSet Type: " + type);
    }
}
