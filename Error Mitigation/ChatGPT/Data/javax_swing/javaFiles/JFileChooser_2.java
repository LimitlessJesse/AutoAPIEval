import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JFileChooser_2 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        JFrame frame = new JFrame();
        
        int returnValue = fileChooser.showSaveDialog(frame);
        
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            System.out.println("File selected: " + fileChooser.getSelectedFile().getName());
        } else if (returnValue == JFileChooser.CANCEL_OPTION) {
            System.out.println("Save dialog canceled");
        } else if (returnValue == JFileChooser.ERROR_OPTION) {
            System.out.println("Error occurred or dialog dismissed");
        }
    }
}
