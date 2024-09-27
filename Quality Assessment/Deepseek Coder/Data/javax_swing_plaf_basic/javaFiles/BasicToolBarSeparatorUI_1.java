import javax.swing.*;
import javax.swing.plaf.basic.BasicToolBarSeparatorUI;
import java.awt.*;

public class BasicToolBarSeparatorUI_1 {
    public static void main(String[] args) {
        JToolBar toolBar = new JToolBar();
        toolBar.setUI(new BasicToolBarSeparatorUI());
        toolBar.setSize(200, 200);
        toolBar.setVisible(true);

        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.add(toolBar);
        frame.setVisible(true);
    }

    @Override
    protected void paint(Graphics g, JComponent c) {
        super.paint(g, c);
        g.setColor(Color.RED);
        g.drawRect(0, 0, c.getWidth()-1, c.getHeight()-1);
    }
}
