import javax.swing.DefaultComboBoxModel;

public class DefaultComboBoxModel_2 {
    public static void main(String[] args) {
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement("Option 1");
        comboBoxModel.addElement("Option 2");
        comboBoxModel.addElement("Option 3");

        System.out.println("Before removing: " + comboBoxModel.getElementAt(1));

        comboBoxModel.removeElement("Option 2");

        System.out.println("After removing: " + comboBoxModel.getElementAt(1));
    }
}
