import javax.print.attribute.standard.PresentationDirection;

public class PresentationDirection_3 {
    public static void main(String[] args) {
        PresentationDirection presentationDirection = PresentationDirection.TO_LEFT;
        String categoryName = presentationDirection.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
