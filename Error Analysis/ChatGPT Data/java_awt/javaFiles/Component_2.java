import java.awt.Component;

public class Component_2 {
    public static void main(String[] args) {
        Component component = new Component() {};
        component.setLocation(100, 200);
        System.out.println("Component location set to x: " + component.getX() + ", y: " + component.getY());
    }
}
