import java.awt.CheckboxMenuItem;

public class CheckboxMenuItem_2 {
    public static void main(String[] args) {
        CheckboxMenuItem checkbox = new CheckboxMenuItem("Example Checkbox");
        boolean state = checkbox.getState();
        System.out.println("Checkbox state: " + state);
    }
}
