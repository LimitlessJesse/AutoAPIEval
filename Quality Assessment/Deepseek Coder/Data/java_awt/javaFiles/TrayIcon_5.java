import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrayIcon_5 {
    public static void main(String[] args) {
        // Create a PopupMenu
        PopupMenu popupMenu = new PopupMenu();

        // Create a MenuItem
        MenuItem menuItem = new MenuItem("Exit");

        // Add ActionListener to MenuItem
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add MenuItem to PopupMenu
        popupMenu.add(menuItem);

        // Create a TrayIcon
        TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage("icon.png"));

        // Set PopupMenu to TrayIcon
        trayIcon.setPopupMenu(popupMenu);

        // Add TrayIcon to SystemTray
        try {
            SystemTray.getSystemTray().add(trayIcon);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
