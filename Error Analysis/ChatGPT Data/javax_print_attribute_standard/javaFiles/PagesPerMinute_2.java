import javax.print.attribute.standard.PagesPerMinute;
import javax.print.attribute.Attribute;

public class PagesPerMinute_2 {
    public static void main(String[] args) {
        PagesPerMinute ppm = new PagesPerMinute(30);
        Class<? extends Attribute> category = ppm.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
