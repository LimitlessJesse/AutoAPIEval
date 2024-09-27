import javax.swing.JTable;
import javax.swing.table.DefaultListSelectionModel;

public class JTable_5 {
    public static void main(String[] args) {
        JTable table = new JTable();
        DefaultListSelectionModel selectionModel = (DefaultListSelectionModel) table.getSelectionModel();
        selectionModel.clearSelection();
    }
}
