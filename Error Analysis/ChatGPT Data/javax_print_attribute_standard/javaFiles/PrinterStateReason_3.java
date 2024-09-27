import javax.print.attribute.standard.PrinterStateReason;

public class PrinterStateReason_3 {
    public static void main(String[] args) {
        PrinterStateReason printerStateReason = PrinterStateReason.MEDIA_NEEDED;
        String reasonName = printerStateReason.getName();
        System.out.println("Printer state reason name: " + reasonName);
    }
}
