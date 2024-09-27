import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class JFileChooser_19 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int dialogType = fileChooser.getDialogType();
        System.out.println("Dialog Type: " + dialogType);
    }
}
