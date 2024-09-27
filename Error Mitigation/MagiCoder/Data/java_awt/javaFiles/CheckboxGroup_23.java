import java.awt.Checkbox;
import java.awt.CheckboxGroup;

public class CheckboxGroup_23 {
    public static void main(String[] args) {
        CheckboxGroup group = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Option 1", group, true);
        Checkbox checkbox2 = new Checkbox("Option 2", group, false);
        Checkbox checkbox3 = new Checkbox("Option 3", group, false);

        System.out.println(group.toString());
    }
}
