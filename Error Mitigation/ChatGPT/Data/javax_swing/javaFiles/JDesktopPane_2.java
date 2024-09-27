import javax.swing.*;

public class JDesktopPane_2 {
    public static void main(String[] args) {
        JDesktopPane desktopPane = new JDesktopPane();
        DesktopManager desktopManager = new DefaultDesktopManager();
        desktopPane.setDesktopManager(desktopManager);
    }
}
