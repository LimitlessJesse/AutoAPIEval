import java.awt.print.PageFormat;
import java.awt.print.PrinterJob;

public class PageFormat_4 {
    public static void main(String[] args) {
        PrinterJob job = PrinterJob.getPrinterJob();
        PageFormat format = job.defaultPage();
        System.out.println("Paper: " + format.getPaper());
    }
}
