import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextArea_12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(5, 20); // 5 rows, 20 columns
        textArea.setRows(10); // set the number of rows to 10

        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.getContentPane().add(scrollPane);

        frame.pack();
        frame.setVisible(true);
    }
}
