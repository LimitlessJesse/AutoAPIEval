import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class PrintJobAdapter_2 extends PrintJobAdapter {
    
    @Override
    public void printJobCompleted(PrintJobEvent pje) {
        // Perform actions when print job is completed
        System.out.println("Print job completed successfully");
    }

    public static void main(String[] args) {
        // Code to initiate print job
        Main printListener = new Main();
        // Add print job event listener
        // For example: printJob.addPrintJobListener(printListener);
    }
}
