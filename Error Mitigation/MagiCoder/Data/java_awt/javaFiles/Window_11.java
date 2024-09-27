import java.awt.*;
import java.awt.event.*;

public class Window_11 extends Frame {
    public Window_11() {
        setSize(300, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void paint(Graphics g) {
        g.drawString("Hello, World!", 50, 50);
    }

    public static void main(String[] args) {
        new Window_11();
    }
}
