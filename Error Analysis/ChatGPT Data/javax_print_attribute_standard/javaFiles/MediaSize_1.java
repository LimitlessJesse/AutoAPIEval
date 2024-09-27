import javax.print.attribute.standard.MediaSize;

public class MediaSize_1 {
    public static void main(String[] args) {
        MediaSize mediaSize = MediaSize.ISO.A4;
        String mediaSizeName = mediaSize.getMediaSizeName();
        System.out.println("Media size name: " + mediaSizeName);
    }
}
