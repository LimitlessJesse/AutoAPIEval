import javax.swing.tree.DefaultTreeSelectionModel;

public class DefaultTreeSelectionModel_2 {
    public static void main(String[] args) {
        DefaultTreeSelectionModel treeSelectionModel = new DefaultTreeSelectionModel();
        int maxSelectionRow = treeSelectionModel.getMaxSelectionRow();
        System.out.println("Max selection row: " + maxSelectionRow);
    }
}
