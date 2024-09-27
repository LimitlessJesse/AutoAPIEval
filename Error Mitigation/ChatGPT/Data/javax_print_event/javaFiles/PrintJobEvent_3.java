import javax.print.DocPrintJob;
import javax.print.event.PrintJobEvent;

public class PrintJobEvent_3 {
    public static void main(String[] args) {
        PrintJobEvent event = new PrintJobEvent();
        DocPrintJob printJob = event.getPrintJob();
        System.out.println("Print job: " + printJob);
    }
}
