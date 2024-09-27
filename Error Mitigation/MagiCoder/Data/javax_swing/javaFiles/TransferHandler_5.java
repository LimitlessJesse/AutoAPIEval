import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;

public class TransferHandler_5 {
    public static void main(String[] args) {
        JTextField textField = new JTextField("Hello, World!");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        TransferHandler handler = textField.getTransferHandler();
        handler.exportToClipboard(textField, clipboard, TransferHandler.COPY);
    }
}
