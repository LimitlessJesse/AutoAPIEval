import javax.swing.JFileChooser;

public class JFileChooser_21 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileHidingEnabled(true);
        boolean isFileHidingEnabled = fileChooser.isFileHidingEnabled();
        System.out.println("Is file hiding enabled? " + isFileHidingEnabled);
    }
}
