import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class CheckboxGroup_3 {
    public static void main(String[] args) {
        CheckboxGroup group = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Option 1", group, false);
        Checkbox checkbox2 = new Checkbox("Option 2", group, false);
        
        setSelectedCheckbox(group, checkbox2);
    }

    public static void setSelectedCheckbox(CheckboxGroup group, Checkbox box) {
        group.setSelectedCheckbox(box);
        System.out.println("Selected checkbox: " + group.getSelectedCheckbox().getLabel());
    }
}
