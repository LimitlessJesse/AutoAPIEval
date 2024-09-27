import javax.print.attribute.standard.PrinterURI;

public class PrinterURI_2 {
    public static void main(String[] args) {
        PrinterURI printerURI1 = new PrinterURI("printer1");
        PrinterURI printerURI2 = new PrinterURI("printer2");

        System.out.println("Are printerURI1 and printerURI2 equal? " + printerURI1.equals(printerURI2));
    }
}
