import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class JFileChooser_1 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        JFrame frame = new JFrame();
        
        int returnValue = fileChooser.showOpenDialog(frame);
        
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            System.out.println("File selected");
        } else if (returnValue == JFileChooser.CANCEL_OPTION) {
            System.out.println("Selection canceled");
        } else if (returnValue == JFileChooser.ERROR_OPTION) {
            System.out.println("Error or dialog dismissed");
        }
    }
}
