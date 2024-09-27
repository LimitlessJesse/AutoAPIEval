import javax.print.attribute.standard.PrinterResolution;

public class PrinterResolution_3 {
    public static void main(String[] args) {
        PrinterResolution resolution1 = new PrinterResolution(300, 300, PrinterResolution.DPI);
        PrinterResolution resolution2 = new PrinterResolution(300, 300, PrinterResolution.DPI);

        boolean isEqual = resolution1.equals(resolution2);
        System.out.println("Are the resolutions equal? " + isEqual);
    }
}
