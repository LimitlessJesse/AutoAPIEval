import javax.print.attribute.standard.PrinterLocation;
import javax.print.attribute.Attribute;

public class PrinterLocation_3 {
    public static void main(String[] args) {
        PrinterLocation location = new PrinterLocation("Office");
        Class<? extends Attribute> category = location.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
