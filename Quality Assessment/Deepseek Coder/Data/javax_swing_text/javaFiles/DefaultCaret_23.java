import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;

public class DefaultCaret_23 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DefaultCaret_23");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(20, 50);
        JScrollPane scrollPane = new JScrollPane(textArea);

        DefaultCaret caret = (DefaultCaret) textArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE); // Set the update policy to ALWAYS_UPDATE

        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);

        for (int i = 0; i < 100; i++) {
            textArea.append("This is line " + i + "\n");
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
