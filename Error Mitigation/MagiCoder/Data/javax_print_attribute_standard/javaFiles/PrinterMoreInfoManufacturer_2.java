import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class PrinterMoreInfoManufacturer_2 {
    public static void main(String[] args) {
        PrinterMoreInfoManufacturer attr1 = new PrinterMoreInfoManufacturer("http://example.com/device1");
        PrinterMoreInfoManufacturer attr2 = new PrinterMoreInfoManufacturer("http://example.com/device2");
        PrinterMoreInfoManufacturer attr3 = new PrinterMoreInfoManufacturer("http://example.com/device1");

        System.out.println(attr1.equals(attr2)); // Output: false
        System.out.println(attr1.equals(attr3)); // Output: true
    }
}
