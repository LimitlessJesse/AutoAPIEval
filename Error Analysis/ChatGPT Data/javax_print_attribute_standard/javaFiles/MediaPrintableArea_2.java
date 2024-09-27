import javax.print.attribute.standard.MediaPrintableArea;

public class MediaPrintableArea_2 {
    public static void main(String[] args) {
        MediaPrintableArea area1 = new MediaPrintableArea(0, 0, 100, 100, MediaPrintableArea.MM);
        MediaPrintableArea area2 = new MediaPrintableArea(0, 0, 100, 100, MediaPrintableArea.MM);

        boolean isEqual = area1.equals(area2);
        System.out.println("Are the two MediaPrintableArea objects equal? " + isEqual);
    }
}
