import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class PrinterMoreInfoManufacturer_2 {
    public static void main(String[] args) {
        PrinterMoreInfoManufacturer attribute1 = new PrinterMoreInfoManufacturer("http://example.com/printer1");
        PrinterMoreInfoManufacturer attribute2 = new PrinterMoreInfoManufacturer("http://example.com/printer2");

        boolean isEqual = attribute1.equals(attribute2);
        System.out.println("Are the attributes equal? " + isEqual);
    }
}
