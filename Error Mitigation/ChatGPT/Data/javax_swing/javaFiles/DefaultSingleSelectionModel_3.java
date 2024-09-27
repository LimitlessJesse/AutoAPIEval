import javax.swing.DefaultSingleSelectionModel;

public class DefaultSingleSelectionModel_3 {
    public static void main(String[] args) {
        DefaultSingleSelectionModel model = new DefaultSingleSelectionModel();
        model.setSelectedIndex(2);
        System.out.println("Selected index: " + model.getSelectedIndex());
    }
}
