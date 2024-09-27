import javax.print.attribute.standard.PrinterMessageFromOperator;
import javax.print.attribute.Attribute;

public class PrinterMessageFromOperator_3 {
    public static void main(String[] args) {
        PrinterMessageFromOperator message = new PrinterMessageFromOperator("Message from operator");
        Class<? extends Attribute> category = message.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
