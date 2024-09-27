import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.event.MouseEvent;

public class BasicPopupMenuUI_2 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        button.setUI(new BasicPopupMenuUI() {
            @Override
            protected MouseInputListener createMouseInputListener(JComponent c) {
                return new MouseInputListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        // Handle mouse click event
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {

                    }

                    @Override
                    public void mouseDragged(MouseEvent e) {

                    }

                    @Override
                    public void mouseMoved(MouseEvent e) {

                    }
                };
            }
        });
        
        button.doClick();
    }
}
