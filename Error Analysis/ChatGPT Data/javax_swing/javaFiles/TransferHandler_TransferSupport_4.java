import javax.swing.TransferHandler.TransferSupport;

public class TransferHandler_TransferSupport_4 {
    public static void main(String[] args) {
        TransferSupport support = new TransferSupport(new Object());
        Transferable transferable = support.getTransferable();
        System.out.println("Transferable object: " + transferable);
    }
}
