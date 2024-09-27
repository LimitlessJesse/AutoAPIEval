import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class JTableHeader_1 {
    public static void main(String[] args) {
        JTableHeader header = new JTableHeader(new TableColumnModel());
        header.setReorderingAllowed(true);
    }
}
