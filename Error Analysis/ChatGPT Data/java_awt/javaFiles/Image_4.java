import java.awt.Image;

public class Image_4 {
    public static void main(String[] args) {
        Image image = new Image(); // Create an instance of Image
        int width = 100;
        int height = 100;
        int hints = Image.SCALE_DEFAULT; // Or any other scaling hint
        Image scaledImage = image.getScaledInstance(width, height, hints);
        
        // Use the scaledImage for further processing
    }
}
