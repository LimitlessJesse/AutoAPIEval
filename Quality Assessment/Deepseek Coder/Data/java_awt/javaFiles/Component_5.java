import java.awt.Component;
import java.awt.TextField;

public class Component_5 {
    public static void main(String[] args) {
        Component component = new TextField();
        component.setFocusable(true);
        System.out.println("Is the component focusable? " + component.isFocusable());
    }
}
