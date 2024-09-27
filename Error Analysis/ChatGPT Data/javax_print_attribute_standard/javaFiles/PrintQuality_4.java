import javax.print.attribute.standard.PrintQuality;
import javax.print.attribute.Attribute;

public class PrintQuality_4 {
    public static void main(String[] args) {
        Class<? extends Attribute> category = PrintQuality.class.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
