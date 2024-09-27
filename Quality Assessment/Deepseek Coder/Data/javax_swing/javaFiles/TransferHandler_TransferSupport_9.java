import javax.swing.TransferHandler;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class TransferHandler_TransferSupport_9 {
    public static void main(String[] args) {
        TransferHandler.TransferSupport transferSupport = new TransferHandler.TransferSupport();
        DataFlavor dataFlavor = DataFlavor.stringFlavor;

        try {
            boolean isSupported = transferSupport.isDataFlavorSupported(dataFlavor);
            System.out.println("Is DataFlavor supported: " + isSupported);
        } catch (UnsupportedFlavorException e) {
            e.printStackTrace();
        }
    }
}
