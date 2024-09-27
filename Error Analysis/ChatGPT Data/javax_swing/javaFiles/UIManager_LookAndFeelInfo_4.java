import javax.swing.UIManager;

public class UIManager_LookAndFeelInfo_4 {
    public static void main(String[] args) {
        UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
        
        for (UIManager.LookAndFeelInfo info : lookAndFeelInfos) {
            System.out.println(info.toString());
        }
    }
}
