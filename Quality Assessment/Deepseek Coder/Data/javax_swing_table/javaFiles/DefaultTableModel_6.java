import javax.swing.table.DefaultTableModel;

public class DefaultTableModel_6 {
    public static void main(String[] args) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Column 1");
        model.addColumn("Column 2");
        model.addColumn("Column 3");

        // Adding rows
        model.addRow(new Object[] { "Cell 1", "Cell 2", "Cell 3" });
        model.addRow(new Object[] { "Cell 4", "Cell 5", "Cell 6" });
        model.addRow(new Object[] { "Cell 7", "Cell 8", "Cell 9" });

        // Checking cell editable status
        boolean isCellEditable = model.isCellEditable(0, 0);
        System.out.println("Is cell (0,0) editable? " + isCellEditable);

        isCellEditable = model.isCellEditable(1, 1);
        System.out.println("Is cell (1,1) editable? " + isCellEditable);

        isCellEditable = model.isCellEditable(2, 2);
        System.out.println("Is cell (2,2) editable? " + isCellEditable);
    }
}
