import javax.print.attribute.standard.PagesPerMinuteColor;

public class PagesPerMinuteColor_5 {
    public static void main(String[] args) {
        PagesPerMinuteColor ppmColor = new PagesPerMinuteColor(10);
        Class<? extends Attribute> category = ppmColor.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
