import javax.sql.rowset.BaseRowSet;

public class BaseRowSet_2 {
    public static void main(String[] args) {
        // Create an instance of BaseRowSet (This is a placeholder as BaseRowSet is abstract)
        BaseRowSet rowSet = new BaseRowSet() {
            @Override
            public int getFetchDirection() {
                return FETCH_FORWARD; // Assuming FETCH_FORWARD is a constant representing fetch direction
            }
        };
        
        // Call the getFetchDirection method
        int fetchDirection = rowSet.getFetchDirection();
        
        System.out.println("Fetch Direction: " + fetchDirection);
    }
}
