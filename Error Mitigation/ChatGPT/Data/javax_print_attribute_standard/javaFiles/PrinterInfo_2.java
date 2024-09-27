import javax.print.attribute.standard.PrinterInfo;

public class PrinterInfo_2 {
    public static void main(String[] args) {
        PrinterInfo printerInfo1 = new PrinterInfo("Printer 1", java.util.Locale.US);
        PrinterInfo printerInfo2 = new PrinterInfo("Printer 1", java.util.Locale.US);
        
        boolean isEqual = printerInfo1.equals(printerInfo2);
        System.out.println("Are printerInfo1 and printerInfo2 equal? " + isEqual);
    }
}
