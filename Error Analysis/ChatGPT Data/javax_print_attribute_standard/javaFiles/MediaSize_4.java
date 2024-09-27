import javax.print.attribute.standard.MediaSize;

public class MediaSize_4 {
    public static void main(String[] args) {
        MediaSize mediaSize1 = MediaSize.ISO.A4;
        MediaSize mediaSize2 = MediaSize.ISO.A4;

        boolean result = mediaSize1.equals(mediaSize2);
        System.out.println("Are the two MediaSizes equal? " + result);
    }
}
