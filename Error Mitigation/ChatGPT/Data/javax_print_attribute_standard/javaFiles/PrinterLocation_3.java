import javax.print.attribute.standard.PrinterLocation;

public class PrinterLocation_3 {
    public static void main(String[] args) {
        PrinterLocation location1 = new PrinterLocation("Office");
        PrinterLocation location2 = new PrinterLocation("Office");

        boolean isEqual = location1.equals(location2);
        System.out.println("Are the locations equal? " + isEqual);
    }
}
