import javax.swing.table.AbstractTableModel;

public class AbstractTableModel_3 {
    public static void main(String[] args) {
        MyTableModel model = new MyTableModel();
        model.setValueAt("New Value", 0, 0);
    }
}

class MyTableModel extends AbstractTableModel {
    private Object[][] data = new Object[10][10];

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return data[0].length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (aValue == null) {
            throw new IllegalArgumentException("Value cannot be null");
        }
        data[rowIndex][columnIndex] = aValue;
        fireTableCellUpdated(rowIndex, columnIndex);
    }
}
