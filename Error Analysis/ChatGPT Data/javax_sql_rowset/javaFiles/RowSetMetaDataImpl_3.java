import javax.sql.rowset.RowSetMetaDataImpl;

public class RowSetMetaDataImpl_3 {
    public static void main(String[] args) {
        RowSetMetaDataImpl metadata = new RowSetMetaDataImpl();
        metadata.setColumnCount(3);

        int displaySize = metadata.getColumnDisplaySize(1);
        System.out.println("Display size of column 1: " + displaySize);
    }
}
