import javax.swing.DefaultListSelectionModel;

public class DefaultListSelectionModel_5 {
    public static void main(String[] args) {
        DefaultListSelectionModel model = new DefaultListSelectionModel();
        model.setValueIsAdjusting(true);
        // do something
        model.setValueIsAdjusting(false);
    }
}
