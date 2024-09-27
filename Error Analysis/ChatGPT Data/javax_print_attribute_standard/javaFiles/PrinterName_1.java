import javax.print.attribute.standard.PrinterName;
import javax.print.attribute.Attribute;

public class PrinterName_1 {
    public static void main(String[] args) {
        PrinterName printerNameAttribute = new PrinterName("Printer1", null);
        String printerName = printerNameAttribute.getName();
        System.out.println("Printer Name: " + printerName);
    }
}
