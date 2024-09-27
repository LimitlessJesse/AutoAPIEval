import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class JTableHeader_1 {
    public static void main(String[] args) {
        JTableHeader tableHeader = new JTableHeader();
        TableColumnModel columnModel = tableHeader.getColumnModel();
        System.out.println(columnModel);
    }
}
