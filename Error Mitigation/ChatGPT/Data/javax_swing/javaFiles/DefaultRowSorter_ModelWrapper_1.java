import javax.swing.DefaultRowSorter;

public class DefaultRowSorter_ModelWrapper_1 {
    public static void main(String[] args) {
        DefaultRowSorter.ModelWrapper modelWrapper = new DefaultRowSorter.ModelWrapper() {
            @Override
            public Object getValueAt(int row, int column) {
                // Your implementation to get the value at the specified index
                return null;
            }
        };
        
        // Example usage
        Object value = modelWrapper.getValueAt(0, 0);
        System.out.println("Value at index (0, 0): " + value);
    }
}
