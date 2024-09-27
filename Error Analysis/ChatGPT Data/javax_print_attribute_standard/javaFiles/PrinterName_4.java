import javax.print.attribute.standard.PrinterName;

public class PrinterName_4 {
    public static void main(String[] args) {
        // Create two PrinterName objects
        PrinterName printer1 = new PrinterName("Printer1", null);
        PrinterName printer2 = new PrinterName("Printer2", null);

        // Test the equals method
        boolean areEqual = printer1.equals(printer2);
        System.out.println("Are printer1 and printer2 equal? " + areEqual);
    }
}
