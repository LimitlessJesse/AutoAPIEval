import javax.print.attribute.standard.PrinterStateReasons;

public class PrinterStateReasons_2 {
    public static void main(String[] args) {
        PrinterStateReasons printerStateReasons = new PrinterStateReasons(PrinterStateReasons.OTHER);
        String categoryName = printerStateReasons.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
