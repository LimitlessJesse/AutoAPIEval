import javax.print.attribute.standard.PrinterName;

public class PrinterName_2 {
    public static void main(String[] args) {
        PrinterName printerName = new PrinterName("MyPrinter", "en");
        String name = printerName.getName();
        System.out.println(name);
    }
}
