import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextArea_8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(10, 30);
        textArea.setLineWrap(true); // Set line wrap on
        textArea.setWrapStyleWord(true); // Set wrap style word on

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}
