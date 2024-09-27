import javax.swing.UIManager;

public class UIManager_LookAndFeelInfo_2 {
    public static void main(String[] args) {
        UIManager.LookAndFeelInfo lookAndFeelInfo = new UIManager.LookAndFeelInfo("Metal", "javax.swing.plaf.metal.MetalLookAndFeel");
        System.out.println(lookAndFeelInfo.getName());
    }
}
