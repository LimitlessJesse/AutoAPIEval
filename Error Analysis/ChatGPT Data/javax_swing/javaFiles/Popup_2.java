import javax.swing.*;

public class Popup_2 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.add(scrollPane);
        
        popupMenu.show(textArea, 10, 10);
        
        // Hiding the popup
        popupMenu.hide();
    }
}
