import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;

public class StringSelection_5 {
    public static void main(String[] args) {
        StringSelection strSel = new StringSelection("Hello");
        DataFlavor flavor = DataFlavor.stringFlavor;
        boolean isSupported = strSel.isDataFlavorSupported(flavor);
        System.out.println("Is String Flavor Supported: " + isSupported);
    }
}
