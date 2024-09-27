import javax.swing.UIManager;

public class UIManager_1 {
    public static void main(String[] args) {
        String lookAndFeelClassName = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        try {
            UIManager.setLookAndFeel(lookAndFeelClassName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
