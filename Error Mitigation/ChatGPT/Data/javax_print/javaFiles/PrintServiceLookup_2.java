import javax.print.DocFlavor;
import javax.print.attribute.AttributeSet;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;

public class PrintServiceLookup_2 {
    public static void main(String[] args) {
        DocFlavor flavor = DocFlavor.BYTE_ARRAY.AUTOSENSE; // Example DocFlavor
        AttributeSet attributes = null; // Example attributes
        
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(flavor, attributes);
        
        for (PrintService service : printServices) {
            System.out.println(service.getName());
        }
    }
}
