import javax.swing.JTextArea;

public class JTextArea_9 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        boolean lineWrap = textArea.getLineWrap();
        System.out.println("Line wrap is: " + lineWrap);
    }
}
