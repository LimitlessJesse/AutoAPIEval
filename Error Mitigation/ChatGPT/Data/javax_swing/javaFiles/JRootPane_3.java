import javax.swing.JRootPane;
import java.awt.Container;

public class JRootPane_3 {
    public static void main(String[] args) {
        JRootPane rootPane = new JRootPane();
        Container contentPane = rootPane.getContentPane();
        System.out.println(contentPane);
    }
}
