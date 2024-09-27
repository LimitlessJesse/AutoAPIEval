import javax.print.attribute.standard.PrinterStateReasons;
import javax.print.attribute.Attribute;

public class PrinterStateReasons_1 {
    public static void main(String[] args) {
        PrinterStateReasons printerStateReasons = new PrinterStateReasons(PrinterStateReasons.MEDIA_NEEDED);
        Class<? extends Attribute> category = printerStateReasons.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
