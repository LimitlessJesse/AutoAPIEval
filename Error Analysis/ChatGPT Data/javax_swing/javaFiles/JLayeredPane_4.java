import javax.swing.*;

public class JLayeredPane_4 {
    public static void main(String[] args) {
        JLayeredPane layeredPane = new JLayeredPane();
        JButton button1 = new JButton("Button 1");
        layeredPane.add(button1, JLayeredPane.DEFAULT_LAYER);
        
        JButton button2 = new JButton("Button 2");
        layeredPane.add(button2, JLayeredPane.DEFAULT_LAYER);
        
        moveToFront(layeredPane, button1);
    }
    
    public static void moveToFront(JLayeredPane layeredPane, Component c) {
        layeredPane.setLayer(c, JLayeredPane.DRAG_LAYER);
    }
}
