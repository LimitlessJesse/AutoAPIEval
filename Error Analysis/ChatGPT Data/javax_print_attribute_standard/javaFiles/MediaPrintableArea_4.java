import javax.print.attribute.standard.MediaPrintableArea;

public class MediaPrintableArea_4 {
    public static void main(String[] args) {
        MediaPrintableArea printableArea = new MediaPrintableArea(0, 0, 100, 100, MediaPrintableArea.MM);
        System.out.println(printableArea.toString());
    }
}
