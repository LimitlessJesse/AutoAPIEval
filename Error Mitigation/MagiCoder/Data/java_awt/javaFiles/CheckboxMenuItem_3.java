import java.awt.CheckboxMenuItem;

public class CheckboxMenuItem_3 {
    public static void main(String[] args) {
        CheckboxMenuItem checkboxMenuItem = new CheckboxMenuItem("Checkbox");
        boolean state = checkboxMenuItem.getState();
        System.out.println("The state of the checkbox is: " + state);
    }
}
