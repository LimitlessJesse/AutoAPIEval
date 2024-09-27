import javax.swing.table.AbstractTableModel;

public class AbstractTableModel_3 extends AbstractTableModel {

    // Implementing the getColumnClass method
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return Boolean.class;
            default:
                return Object.class;
        }
    }

    public static void main(String[] args) {
        // Instantiate Main class or any subclass of AbstractTableModel
        Main model = new Main();

        // Example usage of getColumnClass method
        System.out.println("Column 0 class: " + model.getColumnClass(0));
        System.out.println("Column 1 class: " + model.getColumnClass(1));
        System.out.println("Column 2 class: " + model.getColumnClass(2));
    }
}
