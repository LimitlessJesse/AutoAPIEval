import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;
import java.awt.HeadlessException;

public class PrinterJob_5 {
    public static void main(String[] args) {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        PageFormat defaultPageFormat = printerJob.defaultPage();
        
        try {
            PageFormat modifiedPageFormat = printerJob.pageDialog(defaultPageFormat);
            System.out.println("Modified Page Format: " + modifiedPageFormat);
        } catch (HeadlessException e) {
            System.out.println("HeadlessException occurred: " + e.getMessage());
        }
    }
}
