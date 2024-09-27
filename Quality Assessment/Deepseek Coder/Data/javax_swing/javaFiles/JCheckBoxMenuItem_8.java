import javax.swing.*;
import java.awt.event.*;

public class JCheckBoxMenuItem_8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JCheckBoxMenuItem Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JCheckBoxMenuItem checkBoxMenuItem = new JCheckBoxMenuItem("CheckBox");
        checkBoxMenuItem.setState(false);

        checkBoxMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JCheckBoxMenuItem item = (JCheckBoxMenuItem)e.getSource();
                boolean state = item.getState();
                System.out.println("CheckBox state: " + (state? "Checked" : "Unchecked"));
            }
        });

        JMenu menu = new JMenu("Menu");
        menu.add(checkBoxMenuItem);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
