import javax.swing.JRootPane;
import javax.swing.JMenuBar;

public class JRootPane_1 {
    public static void main(String[] args) {
        JRootPane rootPane = new JRootPane();
        JMenuBar menuBar = rootPane.getJMenuBar();
        System.out.println(menuBar);
    }
}
