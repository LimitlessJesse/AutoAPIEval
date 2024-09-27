import javax.swing.UIManager;

public class UIManager_LookAndFeelInfo_2 {
    public static void main(String[] args) {
        UIManager.LookAndFeelInfo[] lookAndFeels = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo info : lookAndFeels) {
            System.out.println(info.getClassName());
        }
    }
}
