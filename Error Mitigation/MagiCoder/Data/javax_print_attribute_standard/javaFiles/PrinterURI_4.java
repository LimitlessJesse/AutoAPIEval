import javax.print.attribute.standard.PrinterURI;
import java.net.URI;
import java.net.URISyntaxException;

public class PrinterURI_4 {
    public static void main(String[] args) throws URISyntaxException {
        PrinterURI printerURI1 = new PrinterURI("http://example.com/printer1");
        PrinterURI printerURI2 = new PrinterURI("http://example.com/printer2");
        PrinterURI printerURI3 = new PrinterURI("http://example.com/printer1");

        System.out.println(printerURI1.equals(printerURI2)); // false
        System.out.println(printerURI1.equals(printerURI3)); // true
    }
}
