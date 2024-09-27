import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;

public class ImageReader_2 {
    public static void main(String[] args) {
        ImageReader reader = null; // Initialize your ImageReader object here
        
        ImageReadParam param = reader.getDefaultReadParam();
        System.out.println("Default ImageReadParam: " + param);
    }
}
