import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel {
    private String[] columnNames;
    private Object[][] data;

    public MyTableModel(String[] columnNames, Object[][] data) {
        this.columnNames = columnNames;
        this.data = data;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        // Here you can define your own logic to determine if a cell is editable
        // For example, we will make all cells in the first column non-editable
        if (col == 0) {
            return false;
        } else {
            return true;
        }
    }
}

public class AbstractTableModel_5 {
    public static void main(String[] args) {
        // Create some data
        Object[][] data = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
        };

        // Create column names
        String[] columnNames = {"Column 1", "Column 2", "Column 3"};

        // Create a table model
        MyTableModel model = new MyTableModel(columnNames, data);

        // Print if cell (1, 1) is editable
        System.out.println("Is cell (1, 1) editable? " + model.isCellEditable(1, 1));
    }
}
