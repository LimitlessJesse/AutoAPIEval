import javax.swing.JTextArea;

public class JTextArea_11 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        boolean wrapStyleWord = textArea.getWrapStyleWord();
        System.out.println("Wrap Style Word: " + wrapStyleWord);
    }
}
