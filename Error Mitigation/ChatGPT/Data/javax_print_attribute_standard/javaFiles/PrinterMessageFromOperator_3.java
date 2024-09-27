import javax.print.attribute.standard.PrinterMessageFromOperator;

public class PrinterMessageFromOperator_3 {
    public static void main(String[] args) {
        PrinterMessageFromOperator message1 = new PrinterMessageFromOperator("Printer is out of paper", java.util.Locale.US);
        PrinterMessageFromOperator message2 = new PrinterMessageFromOperator("Printer is out of paper", java.util.Locale.US);
        
        boolean isEqual = message1.equals(message2);
        System.out.println("Are the messages equal? " + isEqual);
    }
}
