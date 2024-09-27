import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultTreeSelectionModel;

public class DefaultTreeSelectionModel_7 {
    public static void main(String[] args) {
        DefaultTreeSelectionModel model = new DefaultTreeSelectionModel();
        TreeSelectionListener listener = e -> System.out.println("Tree selection changed");
        model.addTreeSelectionListener(listener);
        model.removeTreeSelectionListener(listener);
    }
}
