import java.awt.print.PrinterException;
import java.awt.print.PrintService;
import java.awt.print.PrinterJob;

public class PrinterJob_2 {
    public static void main(String[] args) {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        PrintService printService = printerJob.getPrintService();
        
        try {
            printerJob.setPrintService(printService);
        } catch (PrinterException e) {
            e.printStackTrace();
        }
    }
}
