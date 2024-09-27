import javax.swing.DefaultSingleSelectionModel;

public class DefaultSingleSelectionModel_2 {
    public static void main(String[] args) {
        DefaultSingleSelectionModel model = new DefaultSingleSelectionModel();
        int selectedIndex = model.getSelectedIndex();
        System.out.println("Selected Index: " + selectedIndex);
    }
}
