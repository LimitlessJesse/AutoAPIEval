import javax.swing.JFileChooser;
import javax.swing.JList;

public class JFileChooser_12 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        JList<?> list = fileChooser.getFileList();
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }
}
