import javax.swing.UIManager;
import java.util.Enumeration;

public class UIManager_LookAndFeelInfo_2 {
    public static void main(String[] args) {
        try {
            Enumeration<Object> enumeration = UIManager.getInstalledLookAndFeels(false);
            while (enumeration.hasMoreElements()) {
                UIManager.LookAndFeelInfo info = (UIManager.LookAndFeelInfo) enumeration.nextElement();
                System.out.println(info.getName());
            }
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}
