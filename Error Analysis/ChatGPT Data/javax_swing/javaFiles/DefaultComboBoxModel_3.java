import javax.swing.DefaultComboBoxModel;

public class DefaultComboBoxModel_3 {
    public static void main(String[] args) {
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement("Option 1");
        comboBoxModel.addElement("Option 2");
        comboBoxModel.addElement("Option 3");

        System.out.println("Before removing element:");
        for (int i = 0; i < comboBoxModel.getSize(); i++) {
            System.out.println(comboBoxModel.getElementAt(i));
        }

        removeElement(comboBoxModel, "Option 2");

        System.out.println("After removing element:");
        for (int i = 0; i < comboBoxModel.getSize(); i++) {
            System.out.println(comboBoxModel.getElementAt(i));
        }
    }

    public static void removeElement(DefaultComboBoxModel<String> model, String element) {
        model.removeElement(element);
    }
}
