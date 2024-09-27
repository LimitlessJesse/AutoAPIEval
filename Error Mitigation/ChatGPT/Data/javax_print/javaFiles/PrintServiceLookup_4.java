import javax.print.MultiDocPrintService;
import javax.print.DocFlavor;
import javax.print.attribute.AttributeSet;
import javax.print.PrintServiceLookup;

public class PrintServiceLookup_4 {
    public static void main(String[] args) {
        DocFlavor[] flavors = new DocFlavor[1]; // Specify the doc flavors
        AttributeSet attributes = null; // Specify the attributes
        
        MultiDocPrintService[] services = PrintServiceLookup.lookupMultiDocPrintServices(flavors, attributes);
        
        if (services.length > 0) {
            System.out.println("Matching MultiDocPrintService objects found:");
            for (MultiDocPrintService service : services) {
                System.out.println(service.toString());
            }
        } else {
            System.out.println("No matching MultiDocPrintService objects found.");
        }
    }
}
