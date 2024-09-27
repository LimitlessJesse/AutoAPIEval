import javax.print.attribute.standard.MediaPrintableArea;

public class MediaPrintableArea_3 {
    public static void main(String[] args) {
        MediaPrintableArea mediaPrintableArea = new MediaPrintableArea(1, 2, 3, 4, MediaPrintableArea.MM);
        int hashCode = mediaPrintableArea.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
