import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class CheckboxGroup_3 {
    public static void main(String[] args) {
        CheckboxGroup group = new CheckboxGroup();
        
        Checkbox checkbox1 = new Checkbox("Option 1", group, false);
        Checkbox checkbox2 = new Checkbox("Option 2", group, false);
        
        group.setSelectedCheckbox(checkbox1);
        
        System.out.println("Checkbox 1 state: " + checkbox1.getState());
        System.out.println("Checkbox 2 state: " + checkbox2.getState());
    }
}
