import javax.print.attribute.standard.PrinterMakeAndModel;

public class PrinterMakeAndModel_3 {
    public static void main(String[] args) {
        PrinterMakeAndModel printer1 = new PrinterMakeAndModel("Epson");
        PrinterMakeAndModel printer2 = new PrinterMakeAndModel("Epson");

        boolean isEqual = printer1.equals(printer2);
        System.out.println("Are the printers equal? " + isEqual);
    }
}
