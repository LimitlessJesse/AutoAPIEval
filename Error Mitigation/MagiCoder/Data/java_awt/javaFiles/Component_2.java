import java.awt.Component;

public class Component_2 {
    public static void main(String[] args) {
        Component component = new Component() {
            @Override
            public void removeNotify() {
                // Your code here
                System.out.println("Component is removed.");
            }
        };

        // Simulate the component being removed
        component.removeNotify();
    }
}
