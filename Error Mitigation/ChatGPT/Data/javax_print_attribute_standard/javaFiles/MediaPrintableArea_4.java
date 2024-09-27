import javax.print.attribute.standard.MediaPrintableArea;

public class MediaPrintableArea_4 {
    public static void main(String[] args) {
        MediaPrintableArea mediaPrintableArea = new MediaPrintableArea(0, 0, 100, 100, MediaPrintableArea.MM);
        String categoryName = mediaPrintableArea.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
