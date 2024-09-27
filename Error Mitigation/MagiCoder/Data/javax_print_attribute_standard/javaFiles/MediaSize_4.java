import javax.print.attribute.standard.MediaSize;

public class MediaSize_4 {
    public static void main(String[] args) {
        MediaSize mediaSize1 = new MediaSize(MediaSize.ISO_A4);
        MediaSize mediaSize2 = new MediaSize(MediaSize.ISO_A4);
        MediaSize mediaSize3 = new MediaSize(MediaSize.ISO_A3);

        System.out.println(mediaSize1.equals(mediaSize2)); // true
        System.out.println(mediaSize1.equals(mediaSize3)); // false
    }
}
