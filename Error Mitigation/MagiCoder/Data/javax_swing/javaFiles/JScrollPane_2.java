import javax.swing.*;

public class JScrollPane_2 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        JTextArea textArea = new JTextArea(20, 20);
        textArea.setText("This is a scrollable text area.");
        scrollPane.setViewportView(textArea);
    }
}
