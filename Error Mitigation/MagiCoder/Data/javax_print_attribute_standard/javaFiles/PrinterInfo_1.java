import javax.print.attribute.standard.PrinterInfo;

public class PrinterInfo_1 {
    public static void main(String[] args) {
        PrinterInfo printerInfo = new PrinterInfo();
        String categoryName = printerInfo.getName();
        System.out.println("Category name: " + categoryName);
    }
}
