import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;

public class StringSelection_2 {
    public static void main(String[] args) {
        StringSelection selection = new StringSelection("Hello");
        DataFlavor flavor = DataFlavor.stringFlavor;
        boolean isSupported = selection.isDataFlavorSupported(flavor);
        System.out.println("Is flavor supported: " + isSupported);
    }
}
