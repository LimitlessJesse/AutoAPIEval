import javax.print.attribute.Attribute;
import javax.print.attribute.standard.NumberOfDocuments;

public class NumberOfDocuments_5 {
    public static void main(String[] args) {
        NumberOfDocuments numberOfDocuments = new NumberOfDocuments();
        Class<? extends Attribute> category = numberOfDocuments.getCategory();
        System.out.println(category);
    }
}
