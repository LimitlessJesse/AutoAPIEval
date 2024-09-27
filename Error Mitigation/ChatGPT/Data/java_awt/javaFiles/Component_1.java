import java.awt.Component;
import java.awt.Graphics;

public class Component_1 {
    public static void main(String[] args) {
        // Create a custom component
        Component customComponent = new Component() {
            @Override
            public void paint(Graphics g) {
                // Custom painting logic here
                g.drawString("Hello, World!", 50, 50);
            }
        };
    }
}
