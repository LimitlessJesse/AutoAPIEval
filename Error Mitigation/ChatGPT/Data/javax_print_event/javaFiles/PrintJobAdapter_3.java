import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;

public class PrintJobAdapter_3 {
    public static void main(String[] args) {
        PrintJobAdapter adapter = new PrintJobAdapter() {
            @Override
            public void printJobFailed(PrintJobEvent pje) {
                System.out.println("Print job failed: " + pje.toString());
            }
        };
    }
}
