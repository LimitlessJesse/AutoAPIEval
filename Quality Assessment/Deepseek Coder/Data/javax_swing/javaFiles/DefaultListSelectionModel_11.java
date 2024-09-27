import javax.swing.DefaultListSelectionModel;

public class DefaultListSelectionModel_11 {
    public static void main(String[] args) {
        DefaultListSelectionModel model = new DefaultListSelectionModel();
        boolean isAdjusting = model.getValueIsAdjusting();
        System.out.println("Initial value of isAdjusting: " + isAdjusting);

        model.setValueIsAdjusting(true);
        isAdjusting = model.getValueIsAdjusting();
        System.out.println("Value of isAdjusting after setting it to true: " + isAdjusting);

        model.setValueIsAdjusting(false);
        isAdjusting = model.getValueIsAdjusting();
        System.out.println("Value of isAdjusting after setting it to false: " + isAdjusting);
    }
}
