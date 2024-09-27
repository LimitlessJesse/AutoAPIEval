import javax.swing.*;

public class JLayeredPane_5 {
    public static void main(String[] args) {
        JLayeredPane layeredPane = new JLayeredPane();
        JButton button = new JButton("Click me!");
        layeredPane.add(button, JLayeredPane.DEFAULT_LAYER);
        
        // Move the button to the back
        moveToBack(button, layeredPane);
    }

    public static void moveToBack(Component c, JLayeredPane layeredPane) {
        layeredPane.setLayer(c, JLayeredPane.DEFAULT_LAYER);
    }
}
