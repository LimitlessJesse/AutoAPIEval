import java.awt.*;
import java.awt.event.*;

public class Canvas_1 extends Frame implements ActionListener {
    private Canvas canvas;

    public Canvas_1() {
        setLayout(new FlowLayout());
        setSize(400, 400);
        setTitle("Paint Example");

        canvas = new Canvas() {
            public void paint(Graphics g) {
                g.drawRect(50, 50, 100, 100);
            }
        };
        canvas.setSize(400, 400);

        add(canvas);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        canvas.repaint();
    }

    public static void main(String[] args) {
        new Canvas_1();
    }
}
