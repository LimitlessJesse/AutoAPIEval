import javax.print.attribute.Attribute;
import javax.print.attribute.standard.PrinterName;

public class PrinterName_2 {
    public static void main(String[] args) {
        PrinterName printerName = new PrinterName("Printer1", null);
        Class<? extends Attribute> category = printerName.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
