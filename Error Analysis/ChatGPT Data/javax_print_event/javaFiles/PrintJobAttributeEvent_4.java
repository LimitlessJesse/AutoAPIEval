import javax.print.DocPrintJob;
import javax.print.event.PrintJobAttributeEvent;

public class PrintJobAttributeEvent_4 {
    public static void main(String[] args) {
        PrintJobAttributeEvent event = new PrintJobAttributeEvent(null, null);
        DocPrintJob job = event.getPrintJob();
        System.out.println("Print job: " + job.toString());
    }
}
