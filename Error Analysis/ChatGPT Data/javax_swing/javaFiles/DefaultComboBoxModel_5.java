import javax.swing.DefaultComboBoxModel;

public class DefaultComboBoxModel_5 {
    public static void main(String[] args) {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Option 1");
        model.addElement("Option 2");

        System.out.println("Before removing all elements: " + model.getSize());
        
        model.removeAllElements();
        
        System.out.println("After removing all elements: " + model.getSize());
    }
}
