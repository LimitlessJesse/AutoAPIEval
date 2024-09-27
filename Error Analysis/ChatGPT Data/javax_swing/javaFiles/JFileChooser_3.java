import javax.swing.JFileChooser;

public class JFileChooser_3 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            java.io.File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getName());
        }
    }
}
