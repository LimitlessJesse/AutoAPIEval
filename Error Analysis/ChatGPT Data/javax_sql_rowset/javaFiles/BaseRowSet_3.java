import javax.sql.rowset.BaseRowSet;

public class BaseRowSet_3 {
    public static void main(String[] args) {
        BaseRowSet rowSet = new BaseRowSet();
        rowSet.setType(BaseRowSet.TYPE_SCROLL_INSENSITIVE);
        System.out.println("RowSet type set successfully!");
    }
}
