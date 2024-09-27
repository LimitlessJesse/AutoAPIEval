import javax.swing.DefaultComboBoxModel;

public class DefaultComboBoxModel_5 {
    public static void main(String[] args) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Option 1");
        model.addElement("Option 2");
        model.addElement("Option 3");

        int size = model.getSize();
        System.out.println("Size of the combo box model: " + size);
    }
}
