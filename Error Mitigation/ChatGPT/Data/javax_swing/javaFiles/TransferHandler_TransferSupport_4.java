import javax.swing.TransferHandler.TransferSupport;

public class TransferHandler_TransferSupport_4 {
    public static void main(String[] args) {
        TransferSupport transferSupport = new TransferSupport();
        boolean isDropOperation = transferSupport.isDrop();
        System.out.println("Is drop operation: " + isDropOperation);
    }
}
