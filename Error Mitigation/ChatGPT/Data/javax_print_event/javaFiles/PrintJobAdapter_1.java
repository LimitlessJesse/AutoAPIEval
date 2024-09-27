import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class PrintJobAdapter_1 {
    public static void main(String[] args) {
        PrintJobAdapter adapter = new PrintJobAdapter() {
            @Override
            public void printDataTransferCompleted(PrintJobEvent pje) {
                System.out.println("Data transfer completed successfully.");
                // Client may free local resources allocated for the data here
            }
        };
    }
}
