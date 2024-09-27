import javax.print.attribute.standard.PrinterMakeAndModel;

public class PrinterMakeAndModel_1 {
    public static void main(String[] args) {
        PrinterMakeAndModel printerMakeAndModel = new PrinterMakeAndModel();
        String categoryName = printerMakeAndModel.getName();
        System.out.println("The category name is: " + categoryName);
    }
}
