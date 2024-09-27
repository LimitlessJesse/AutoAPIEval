import javax.print.attribute.standard.PrinterMoreInfo;

public class PrinterMoreInfo_2 {
    public static void main(String[] args) {
        PrinterMoreInfo printerMoreInfo = new PrinterMoreInfo();
        String categoryName = printerMoreInfo.getName();
        System.out.println("Category name: " + categoryName);
    }
}
