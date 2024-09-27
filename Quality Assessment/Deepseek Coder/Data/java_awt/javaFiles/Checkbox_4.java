import java.awt.*;

public class Checkbox_4 {
    public static void main(String[] args) {
        CheckboxGroup group = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Checkbox 1");
        Checkbox checkbox2 = new Checkbox("Checkbox 2");

        checkbox1.setCheckboxGroup(group);
        checkbox2.setCheckboxGroup(group);
    }
}
