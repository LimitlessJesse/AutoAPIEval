import java.awt.CheckboxMenuItem;

public class CheckboxMenuItem_1 {
    public static void main(String[] args) {
        CheckboxMenuItem checkbox = new CheckboxMenuItem("Example Checkbox");
        checkbox.setState(true);
        System.out.println("Checkbox state: " + checkbox.getState());
    }
}
