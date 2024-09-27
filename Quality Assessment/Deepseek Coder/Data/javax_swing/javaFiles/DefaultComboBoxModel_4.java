import javax.swing.DefaultComboBoxModel;

public class DefaultComboBoxModel_4 {
    public static void main(String[] args) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Element 1");
        model.addElement("Element 2");
        model.addElement("Element 3");

        System.out.println("Before removal: " + model);

        model.removeElement("Element 2");

        System.out.println("After removal: " + model);
    }
}
