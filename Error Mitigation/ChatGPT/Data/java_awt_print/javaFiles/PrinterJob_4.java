import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class PrinterJob_4 {
    public static void main(String[] args) {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        
        try {
            printerJob.print();
        } catch (PrinterException e) {
            System.out.println("An error occurred while printing: " + e.getMessage());
        }
    }
}
