import java.awt.print.PrinterJob;
import javax.print.PrintService;

public class PrinterJob_3 {
    public static void main(String[] args) {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        PrintService printService = printerJob.getPrintService();
        System.out.println("Print Service: " + printService.getName());
    }
}
