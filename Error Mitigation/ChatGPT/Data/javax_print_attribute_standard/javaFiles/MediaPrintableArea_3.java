import javax.print.attribute.standard.MediaPrintableArea;

public class MediaPrintableArea_3 {
    public static void main(String[] args) {
        MediaPrintableArea mediaPrintableArea1 = new MediaPrintableArea(0, 0, 100, 100);
        MediaPrintableArea mediaPrintableArea2 = new MediaPrintableArea(0, 0, 100, 100);
        
        boolean isEqual = mediaPrintableArea1.equals(mediaPrintableArea2);
        System.out.println("Are the media printable areas equal? " + isEqual);
    }
}
