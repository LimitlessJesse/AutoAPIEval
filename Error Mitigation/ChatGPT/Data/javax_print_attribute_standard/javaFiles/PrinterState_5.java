import javax.print.attribute.standard.PrinterState;

public class PrinterState_5 {
    public static void main(String[] args) {
        PrinterState printerState = PrinterState.IDLE;
        String categoryName = printerState.getName();
        System.out.println("Category name: " + categoryName);
    }
}
