import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class PrintJobAdapter_5 {
    public static void main(String[] args) {
        PrintJobAdapter adapter = new PrintJobAdapter() {
            @Override
            public void printJobNoMoreEvents(PrintJobEvent pje) {
                System.out.println("No more events will be delivered for the print job.");
            }
        };
    }
}
