import javax.print.attribute.standard.PrinterMoreInfo;

public class PrinterMoreInfo_1 {
    public static void main(String[] args) {
        PrinterMoreInfo printerMoreInfo = new PrinterMoreInfo("Printer Name", "Printer Description");
        String name = printerMoreInfo.getName();
        System.out.println("Printer Name: " + name);
    }
}
