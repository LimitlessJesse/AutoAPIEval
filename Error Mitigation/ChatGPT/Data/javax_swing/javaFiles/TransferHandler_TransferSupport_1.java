import javax.swing.TransferHandler.TransferSupport;
import java.awt.datatransfer.DataFlavor;

public class TransferHandler_TransferSupport_1 {
    public static void main(String[] args) {
        TransferSupport transferSupport = new TransferSupport(null, null);
        DataFlavor dataFlavor = new DataFlavor(String.class, "String");
        boolean isSupported = transferSupport.isDataFlavorSupported(dataFlavor);
        System.out.println("Is DataFlavor supported: " + isSupported);
    }
}
