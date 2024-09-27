import javax.swing.JTextArea;

public class JTextArea_13 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        textArea.setText("This is a test\nThis is another test");
        int rows = textArea.getRows();
        System.out.println("Number of rows: " + rows);
    }
}
