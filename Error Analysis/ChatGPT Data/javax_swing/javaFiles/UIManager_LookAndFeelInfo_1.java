import javax.swing.UIManager;

public class UIManager_LookAndFeelInfo_1 {
    public static void main(String[] args) {
        UIManager.LookAndFeelInfo lookAndFeelInfo = new UIManager.LookAndFeelInfo("name", "className");
        String className = lookAndFeelInfo.getClassName();
        System.out.println(className);
    }
}
