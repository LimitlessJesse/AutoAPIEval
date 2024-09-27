import javax.swing.JFileChooser;

public class JFileChooser_17 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a file");
        System.out.println(fileChooser.getDialogTitle());
    }
}
