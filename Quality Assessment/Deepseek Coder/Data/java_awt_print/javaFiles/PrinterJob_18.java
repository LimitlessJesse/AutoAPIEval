import java.awt.print.PrinterJob;

public class PrinterJob_18 {
    public static void main(String[] args) {
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        boolean printDialogReturnValue = printerJob.printDialog();
        System.out.println("printDialog() returned: " + printDialogReturnValue);
    }
}
