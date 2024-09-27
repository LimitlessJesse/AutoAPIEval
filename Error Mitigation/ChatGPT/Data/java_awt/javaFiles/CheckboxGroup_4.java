import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class CheckboxGroup_4 {
    public static void main(String[] args) {
        CheckboxGroup group = new CheckboxGroup();
        
        Checkbox checkbox1 = new Checkbox("Option 1", group, false);
        Checkbox checkbox2 = new Checkbox("Option 2", group, false);
        
        checkbox1.setState(true);
        
        Checkbox selectedCheckbox = group.getSelectedCheckbox();
        
        if(selectedCheckbox != null) {
            System.out.println("Selected Checkbox: " + selectedCheckbox.getLabel());
        } else {
            System.out.println("No checkbox selected");
        }
    }
}
