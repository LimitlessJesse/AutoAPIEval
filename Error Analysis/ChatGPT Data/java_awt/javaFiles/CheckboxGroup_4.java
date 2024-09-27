import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class CheckboxGroup_4 {
    public static void main(String[] args) {
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        
        Checkbox checkbox1 = new Checkbox("Option 1", checkboxGroup, false);
        Checkbox checkbox2 = new Checkbox("Option 2", checkboxGroup, true);
        
        checkboxGroup.setCurrent(checkbox1);
        
        System.out.println("Current selected checkbox: " + checkboxGroup.getSelectedCheckbox().getLabel());
    }
}
