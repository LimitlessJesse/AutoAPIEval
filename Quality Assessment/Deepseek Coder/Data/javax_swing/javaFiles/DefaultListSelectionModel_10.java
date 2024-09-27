import javax.swing.DefaultListSelectionModel;

public class DefaultListSelectionModel_10 {
    public static void main(String[] args) {
        DefaultListSelectionModel model = new DefaultListSelectionModel();
        model.setValueIsAdjusting(true);
        // do some operations
        model.setValueIsAdjusting(false);
    }
}
