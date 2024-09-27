import javax.swing.JRootPane;
import javax.swing.JLayeredPane;

public class JRootPane_2 {
    public static void main(String[] args) {
        JRootPane rootPane = new JRootPane();
        JLayeredPane layeredPane = rootPane.getLayeredPane();
        System.out.println(layeredPane);
    }
}
