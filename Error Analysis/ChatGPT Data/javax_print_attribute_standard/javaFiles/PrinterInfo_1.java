import javax.print.attribute.standard.PrinterInfo;

public class PrinterInfo_1 {
    public static void main(String[] args) {
        PrinterInfo printerInfo = new PrinterInfo("Printer1");
        String name = printerInfo.getName();
        System.out.println(name);
    }
}
