import javax.print.attribute.standard.PrinterName;

public class PrinterName_1 {
    public static void main(String[] args) {
        PrinterName printerName = new PrinterName("MyPrinter", null);
        String categoryName = printerName.getName();
        System.out.println("Category name: " + categoryName);
    }
}
