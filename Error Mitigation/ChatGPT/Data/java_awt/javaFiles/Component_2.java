import java.awt.Component;
import java.awt.Dimension;

public class Component_2 {
    public static void main(String[] args) {
        Component component = new Component() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 100);
            }
        };

        Dimension preferredSize = component.getPreferredSize();
        System.out.println("Preferred Size: " + preferredSize);
    }
}
