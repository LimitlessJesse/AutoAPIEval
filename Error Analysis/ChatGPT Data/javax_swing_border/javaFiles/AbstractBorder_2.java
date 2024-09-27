import javax.swing.border.AbstractBorder;
import java.awt.*;

public class AbstractBorder_2 {
    public static void main(String[] args) {
        AbstractBorder border = new AbstractBorder() {
            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(10, 10, 10, 10); // Example, you can modify the values accordingly
            }
        };

        // Example usage
        JButton button = new JButton("Click me");
        button.setBorder(border);
    }
}
