import javax.swing.UIManager.LookAndFeelInfo;

public class UIManager_LookAndFeelInfo_3 {
    public static void main(String[] args) {
        LookAndFeelInfo[] lookAndFeelInfo = UIManager.getInstalledLookAndFeels();
        for (LookAndFeelInfo info : lookAndFeelInfo) {
            System.out.println(info.toString());
        }
    }
}
