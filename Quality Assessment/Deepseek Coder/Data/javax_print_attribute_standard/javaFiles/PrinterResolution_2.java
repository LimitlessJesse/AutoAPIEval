import javax.print.attribute.standard.PrinterResolution;

public class PrinterResolution_2 {
    public static void main(String[] args) {
        PrinterResolution resolution1 = new PrinterResolution(100, 100);
        PrinterResolution resolution2 = new PrinterResolution(100, 100);

        boolean isEqual = resolution1.equals(resolution2);

        System.out.println("Are the two PrinterResolution objects equal? " + isEqual);
    }
}
