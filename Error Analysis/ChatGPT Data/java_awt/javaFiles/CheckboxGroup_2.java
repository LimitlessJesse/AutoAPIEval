import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class CheckboxGroup_2 {
    public static void main(String[] args) {
        CheckboxGroup group = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Option 1", group, false);
        Checkbox checkbox2 = new Checkbox("Option 2", group, false);
        
        // Get the selected checkbox from the group
        Checkbox selectedCheckbox = group.getSelectedCheckbox();
        
        // Print the label of the selected checkbox if any
        if(selectedCheckbox != null) {
            System.out.println("Selected Checkbox: " + selectedCheckbox.getLabel());
        } else {
            System.out.println("No checkbox selected");
        }
    }
}
