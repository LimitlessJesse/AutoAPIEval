import javax.print.attribute.standard.PrinterName;

public class PrinterName_2 {
    public static void main(String[] args) {
        PrinterName printerName1 = new PrinterName("Printer1", null);
        PrinterName printerName2 = new PrinterName("Printer1", null);
        
        boolean isEqual = printerName1.equals(printerName2);
        System.out.println("Are printer names equal? " + isEqual);
    }
}
