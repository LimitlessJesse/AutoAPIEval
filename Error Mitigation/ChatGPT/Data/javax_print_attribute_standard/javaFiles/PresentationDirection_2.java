import javax.print.attribute.standard.PresentationDirection;

public class PresentationDirection_2 {
    public static void main(String[] args) {
        PresentationDirection presentationDirection = PresentationDirection.NEXT_TO_BOTTOM;
        Class<? extends Attribute> category = presentationDirection.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
