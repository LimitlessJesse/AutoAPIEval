import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class PrinterMoreInfoManufacturer_5 {
    public static void main(String[] args) {
        PrinterMoreInfoManufacturer attribute = new PrinterMoreInfoManufacturer("http://example.com/printer");
        Class<? extends Attribute> category = attribute.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
