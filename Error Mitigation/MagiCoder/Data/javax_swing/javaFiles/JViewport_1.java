import javax.swing.*;

public class JViewport_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JViewport viewport = new JViewport();
        JLabel label = new JLabel("Hello, World!");

        viewport.setView(label);

        frame.add(viewport);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
