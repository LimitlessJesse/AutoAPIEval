import javax.print.attribute.standard.PrinterLocation;

public class PrinterLocation_1 {
    public static void main(String[] args) {
        PrinterLocation printerLocation = new PrinterLocation("Room 101");
        String categoryName = printerLocation.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
