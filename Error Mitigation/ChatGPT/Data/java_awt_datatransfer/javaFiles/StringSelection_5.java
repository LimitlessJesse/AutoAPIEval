import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.io.Reader;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;

public class StringSelection_5 {
    public static void main(String[] args) {
        StringSelection selection = new StringSelection("Hello World");
        
        try {
            Object data = selection.getTransferData(DataFlavor.stringFlavor);
            System.out.println("Data: " + data);
        } catch (UnsupportedFlavorException | IOException e) {
            e.printStackTrace();
        }
    }
}
