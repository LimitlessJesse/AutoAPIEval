import javax.swing.DefaultListSelectionModel;

public class DefaultListSelectionModel_2 {
    public static void main(String[] args) {
        DefaultListSelectionModel selectionModel = new DefaultListSelectionModel();
        selectionModel.addSelectionInterval(1, 3);
        System.out.println("Selected indices: " + selectionModel.getMinSelectionIndex() + " - " + selectionModel.getMaxSelectionIndex());
    }
}
