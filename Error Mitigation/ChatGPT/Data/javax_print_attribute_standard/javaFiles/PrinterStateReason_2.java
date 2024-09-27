import javax.print.attribute.standard.PrinterStateReason;

public class PrinterStateReason_2 {
    public static void main(String[] args) {
        PrinterStateReason printerStateReason = PrinterStateReason.MEDIA_NEEDED;
        String categoryName = printerStateReason.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
