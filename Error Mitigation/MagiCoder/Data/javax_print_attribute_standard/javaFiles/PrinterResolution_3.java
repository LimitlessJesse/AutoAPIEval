import javax.print.attribute.standard.PrinterResolution;

public class PrinterResolution_3 {
    public static void main(String[] args) {
        PrinterResolution resolution1 = new PrinterResolution(100, 200, PrinterResolution.DIN_METRIC);
        PrinterResolution resolution2 = new PrinterResolution(100, 200, PrinterResolution.DIN_METRIC);
        PrinterResolution resolution3 = new PrinterResolution(300, 400, PrinterResolution.DIN_METRIC);

        System.out.println(resolution1.equals(resolution2)); // true
        System.out.println(resolution1.equals(resolution3)); // false
    }
}
