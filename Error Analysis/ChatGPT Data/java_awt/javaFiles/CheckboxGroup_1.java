import java.awt.CheckboxGroup;
import java.awt.Checkbox;

public class CheckboxGroup_1 {
    public static void main(String[] args) {
        CheckboxGroup group = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Option 1", group, false);
        Checkbox checkbox2 = new Checkbox("Option 2", group, false);

        checkbox1.setState(true);
        System.out.println("Selected checkbox: " + group.getCurrent().getLabel());
    }
}
