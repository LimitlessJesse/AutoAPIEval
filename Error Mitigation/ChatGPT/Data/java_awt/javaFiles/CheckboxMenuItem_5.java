import java.awt.CheckboxMenuItem;

public class CheckboxMenuItem_5 {
    public static void main(String[] args) {
        CheckboxMenuItem checkboxMenuItem = new CheckboxMenuItem("Example Checkbox");
        String paramString = checkboxMenuItem.paramString();
        System.out.println("Parameter String: " + paramString);
    }
}
