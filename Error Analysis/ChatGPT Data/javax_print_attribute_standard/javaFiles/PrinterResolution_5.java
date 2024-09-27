import javax.print.attribute.standard.PrinterResolution;
import javax.print.attribute.Attribute;

public class PrinterResolution_5 {
    public static void main(String[] args) {
        PrinterResolution printerResolution = new PrinterResolution(300, 600, PrinterResolution.DPI);
        Class<? extends Attribute> category = printerResolution.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
