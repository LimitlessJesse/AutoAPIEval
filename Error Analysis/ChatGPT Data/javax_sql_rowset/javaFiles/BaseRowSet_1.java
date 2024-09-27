import javax.sql.rowset.BaseRowSet;

public class BaseRowSet_1 {
    public static void main(String[] args) {
        // Create a BaseRowSet instance
        BaseRowSet rowSet = null;

        // Set fetch direction to FETCH_REVERSE
        rowSet.setFetchDirection(BaseRowSet.FETCH_REVERSE);
    }
}
