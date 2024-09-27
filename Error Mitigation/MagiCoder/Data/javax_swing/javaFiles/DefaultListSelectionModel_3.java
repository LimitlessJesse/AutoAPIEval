import javax.swing.DefaultListSelectionModel;

public class DefaultListSelectionModel_3 {
    public static void main(String[] args) {
        DefaultListSelectionModel model = new DefaultListSelectionModel();
        model.setSelectionInterval(0, 1);
        System.out.println(model.isSelectedIndex(0));  // Output: true
        System.out.println(model.isSelectedIndex(1));  // Output: false
    }
}
