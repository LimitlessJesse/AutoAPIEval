import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class CheckboxGroup_2 {
    public static void main(String[] args) {
        CheckboxGroup group = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Option 1", group, false);
        Checkbox checkbox2 = new Checkbox("Option 2", group, true);
        
        Checkbox selectedCheckbox = group.getCurrent();
        System.out.println("Selected Checkbox: " + selectedCheckbox.getLabel());
    }
}
