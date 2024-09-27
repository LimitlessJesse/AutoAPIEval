import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenu_32 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPopupMenu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(new JMenuItem("Open"));
        popupMenu.add(new JMenuItem("Save"));
        popupMenu.add(new JMenuItem("Exit"));

        fileMenu.getPopupMenu().add(popupMenu);

        fileMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                popupMenu.show(fileMenu, 0, fileMenu.getHeight());
            }
        });

        frame.setVisible(true);
    }
}
