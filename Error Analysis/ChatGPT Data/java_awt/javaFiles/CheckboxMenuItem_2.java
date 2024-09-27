import java.awt.CheckboxMenuItem;

public class CheckboxMenuItem_2 {
    public static void main(String[] args) {
        CheckboxMenuItem menuItem = new CheckboxMenuItem("Example CheckboxMenuItem", true);
        boolean state = menuItem.getState();
        System.out.println("CheckboxMenuItem state: " + state);
    }
}
