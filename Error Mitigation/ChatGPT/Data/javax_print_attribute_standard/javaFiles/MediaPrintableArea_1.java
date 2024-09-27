import javax.print.attribute.standard.MediaPrintableArea;

public class MediaPrintableArea_1 {
    public static void main(String[] args) {
        MediaPrintableArea printableArea = new MediaPrintableArea(0, 0, 8.5f, 11.0f, MediaPrintableArea.INCH);
        float[] area = printableArea.getPrintableArea(MediaPrintableArea.INCH);
        System.out.println("Printable Area: x=" + area[0] + ", y=" + area[1] + ", w=" + area[2] + ", h=" + area[3]);
    }
}
