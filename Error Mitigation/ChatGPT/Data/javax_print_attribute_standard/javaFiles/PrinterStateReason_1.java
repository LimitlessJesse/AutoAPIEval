import javax.print.attribute.standard.PrinterStateReason;

public class PrinterStateReason_1 {
    public static void main(String[] args) {
        PrinterStateReason printerStateReason = PrinterStateReason.MEDIA_NEEDED;
        Class<? extends Attribute> category = printerStateReason.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
