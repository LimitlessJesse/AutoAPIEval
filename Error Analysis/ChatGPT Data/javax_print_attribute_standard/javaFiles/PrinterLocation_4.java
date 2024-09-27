import javax.print.attribute.standard.PrinterLocation;

public class PrinterLocation_4 {
    public static void main(String[] args) {
        PrinterLocation printerLocation = new PrinterLocation("Office Room");
        String locationName = printerLocation.getName();
        System.out.println("Printer Location: " + locationName);
    }
}
