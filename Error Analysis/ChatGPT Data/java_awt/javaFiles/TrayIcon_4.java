import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrayIcon_4 {
    public static void main(String[] args) {
        PopupMenu popup = new PopupMenu();

        MenuItem menuItem = new MenuItem("Exit");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        popup.add(menuItem);

        SystemTray systemTray = SystemTray.getSystemTray();
        Image image = Toolkit.getDefaultToolkit().getImage("icon.png");
        TrayIcon trayIcon = new TrayIcon(image, "Tray Icon");
        trayIcon.setPopupMenu(popup);

        try {
            systemTray.add(trayIcon);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
