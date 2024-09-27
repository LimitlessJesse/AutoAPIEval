import java.awt.print.Pageable;
import java.awt.print.PrinterJob;

public class PrinterJob_3 {
    public static void main(String[] args) {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        Pageable document = new YourPageableImplementation(); // Implement YourPageableImplementation class
        try {
            printerJob.setPageable(document);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
