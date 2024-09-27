import java.awt.Component;

public class Component_5 {
    public static void main(String[] args) {
        Component component = new Component() {};
        component.setVisible(true); // Shows the component
        System.out.println("Is component visible: " + component.isVisible());
        
        component.setVisible(false); // Hides the component
        System.out.println("Is component visible: " + component.isVisible());
    }
}
