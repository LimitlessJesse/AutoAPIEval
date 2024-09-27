import javax.swing.*;

public class JLayeredPane_2 {
    public static void main(String[] args) {
        JLayeredPane layeredPane = new JLayeredPane();
        JButton button = new JButton("Click me!");
        layeredPane.add(button);
        
        // Set the position of the button to be at index 0
        setPosition(layeredPane, button, 0);
        
        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    
    public static void setPosition(JLayeredPane layeredPane, Component c, int position) {
        layeredPane.setLayer(c, position);
    }
}
