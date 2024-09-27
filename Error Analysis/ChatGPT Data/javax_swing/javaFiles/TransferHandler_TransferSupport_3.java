import javax.swing.TransferHandler;

public class TransferHandler_TransferSupport_3 {
    public static void main(String[] args) {
        TransferHandler.TransferSupport support = new TransferHandler.TransferSupport(null);
        DataFlavor[] flavors = support.getDataFlavors();
        for (DataFlavor flavor : flavors) {
            System.out.println(flavor);
        }
    }
}
