import javax.swing.UIManager;

public class UIManager_LookAndFeelInfo_2 {
    public static void main(String[] args) {
        UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
        
        for (UIManager.LookAndFeelInfo look : looks) {
            String name = look.getName();
            System.out.println(name);
        }
    }
}
