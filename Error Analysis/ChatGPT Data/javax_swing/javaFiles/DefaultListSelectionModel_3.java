import javax.swing.DefaultListSelectionModel;

public class DefaultListSelectionModel_3 {
    public static void main(String[] args) {
        DefaultListSelectionModel selectionModel = new DefaultListSelectionModel();
        
        // Removing selection interval from index 2 to index 5
        selectionModel.removeSelectionInterval(2, 5);
    }
}
