import javax.print.attribute.standard.PrinterURI;
import javax.print.attribute.Attribute;

public class PrinterURI_5 {
    public static void main(String[] args) {
        PrinterURI printerURI = new PrinterURI("http://example.com/printer");
        Class<? extends Attribute> category = printerURI.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
