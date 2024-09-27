import javax.print.attribute.standard.PrinterURI;

public class PrinterURI_4 {
    public static void main(String[] args) {
        PrinterURI printerURI = new PrinterURI("http://example.com/printer");
        String printerName = printerURI.getName();
        System.out.println("Printer Name: " + printerName);
    }
}
