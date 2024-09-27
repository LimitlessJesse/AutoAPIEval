import javax.print.attribute.standard.PrinterMessageFromOperator;

public class PrinterMessageFromOperator_2 {
    public static void main(String[] args) {
        PrinterMessageFromOperator message = new PrinterMessageFromOperator("Operator message");
        String name = message.getName();
        System.out.println("Message name: " + name);
    }
}
