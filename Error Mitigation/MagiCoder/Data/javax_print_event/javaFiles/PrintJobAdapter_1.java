import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class PrintJobAdapter_1 {
    public static void main(String[] args) {
        PrintJobAdapter adapter = new PrintJobAdapter() {
            @Override
            public void printDataTransferCompleted(PrintJobEvent pje) {
                // Your code here
            }
        };

        // You can use the adapter here
    }
}
