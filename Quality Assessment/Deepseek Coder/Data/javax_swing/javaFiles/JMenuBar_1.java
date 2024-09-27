import javax.swing.*;

public class JMenuBar_1 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("JMenuBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create JMenu
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // Add JMenu to JMenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Add JMenuItems to JMenu
        fileMenu.add(new JMenuItem("New"));
        fileMenu.add(new JMenuItem("Open"));
        fileMenu.add(new JMenuItem("Save"));

        editMenu.add(new JMenuItem("Cut"));
        editMenu.add(new JMenuItem("Copy"));
        editMenu.add(new JMenuItem("Paste"));

        // Set JMenuBar to JFrame
        frame.setJMenuBar(menuBar);

        // Make the JFrame visible
        frame.setVisible(true);
    }
}
