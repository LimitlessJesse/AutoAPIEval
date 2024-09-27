import javax.print.attribute.standard.PrinterState;

public class PrinterState_4 {
    public static void main(String[] args) {
        PrinterState printerState = PrinterState.IDLE;
        String stateName = printerState.getName();
        System.out.println("Printer state: " + stateName);
    }
}
