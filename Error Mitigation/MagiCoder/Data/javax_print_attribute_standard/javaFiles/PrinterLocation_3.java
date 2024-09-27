import javax.print.attribute.standard.PrinterLocation;

public class PrinterLocation_3 {
    public static void main(String[] args) {
        PrinterLocation location1 = new PrinterLocation("Location1", "Locale1");
        PrinterLocation location2 = new PrinterLocation("Location1", "Locale1");
        PrinterLocation location3 = new PrinterLocation("Location2", "Locale2");

        System.out.println(location1.equals(location2)); // true
        System.out.println(location1.equals(location3)); // false
    }
}
