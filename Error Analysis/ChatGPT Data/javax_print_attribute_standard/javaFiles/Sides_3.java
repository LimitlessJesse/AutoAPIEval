import javax.print.attribute.standard.Sides;
import javax.print.attribute.Attribute;

public class Sides_3 {
    public static void main(String[] args) {
        Attribute attribute = new Sides();
        Class<? extends Attribute> category = attribute.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
