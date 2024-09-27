import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.Attribute;

public class MediaPrintableArea_5 {
    public static void main(String[] args) {
        MediaPrintableArea mediaPrintableArea = new MediaPrintableArea(0, 0, 100, 100, MediaPrintableArea.MM);
        Class<? extends Attribute> category = mediaPrintableArea.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
