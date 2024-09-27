import javax.print.attribute.standard.PrinterMakeAndModel;

public class PrinterMakeAndModel_4 {
    public static void main(String[] args) {
        PrinterMakeAndModel printer1 = new PrinterMakeAndModel("Canon");
        PrinterMakeAndModel printer2 = new PrinterMakeAndModel("Epson");

        boolean result = printer1.equals(printer2);
        System.out.println("Are the printers equal? " + result);
    }
}
