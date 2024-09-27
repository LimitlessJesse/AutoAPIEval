import javax.print.attribute.standard.PrinterInfo;
import javax.print.attribute.Attribute;

public class PrinterInfo_5 {
    public static void main(String[] args) {
        PrinterInfo printerInfo = new PrinterInfo("Printer Name");
        Class<? extends Attribute> category = printerInfo.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
