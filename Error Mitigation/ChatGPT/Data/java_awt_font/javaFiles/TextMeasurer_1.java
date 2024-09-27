import java.awt.font.TextLayout;

public class TextMeasurer_1 {
    public static void main(String[] args) {
        TextMeasurer textMeasurer = new TextMeasurer(); // Assuming TextMeasurer class is instantiated
        int start = 0;
        int limit = 5;
        
        try {
            TextLayout textLayout = textMeasurer.getLayout(start, limit);
            // Use the TextLayout object as needed
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: limit is less than start");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: start or limit is not between the beginning and end of the paragraph");
        }
    }
}
