import javax.print.attribute.standard.Finishings;
import javax.print.attribute.Attribute;

public class Finishings_2 {
    public static void main(String[] args) {
        Finishings finishings = Finishings.STAPLE;
        Class<? extends Attribute> category = finishings.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
