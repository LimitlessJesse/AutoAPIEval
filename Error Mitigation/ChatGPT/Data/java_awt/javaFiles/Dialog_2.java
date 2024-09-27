import java.awt.Dialog;

public class Dialog_2 {
    public static void main(String[] args) {
        Dialog dialog = new Dialog(null, "Resizable Dialog", true);
        dialog.setResizable(true);
        dialog.setVisible(true);
    }
}
