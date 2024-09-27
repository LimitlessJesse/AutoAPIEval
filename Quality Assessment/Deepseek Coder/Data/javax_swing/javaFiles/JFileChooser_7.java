import javax.swing.JFileChooser;

public class JFileChooser_7 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int selectionMode = fileChooser.getMode();
        System.out.println("File Selection Mode: " + selectionMode);
    }
}
