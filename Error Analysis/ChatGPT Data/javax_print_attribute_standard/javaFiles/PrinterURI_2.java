import javax.print.attribute.standard.PrinterURI;

public class PrinterURI_2 {
    public static void main(String[] args) {
        PrinterURI printer1 = new PrinterURI("http://example.com/printer1");
        PrinterURI printer2 = new PrinterURI("http://example.com/printer2");

        boolean isEqual = printer1.equals(printer2);
        System.out.println("Are printer1 and printer2 equal? " + isEqual);
    }
}
