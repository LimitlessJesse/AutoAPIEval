import java.awt.font.TextMeasurer;

public class TextMeasurer_2 {
    public static void main(String[] args) {
        TextMeasurer textMeasurer = new TextMeasurer();
        int start = 0;
        int limit = 5;
        float width = textMeasurer.getAdvanceBetween(start, limit);
        System.out.println("Graphical width of line from index " + start + " to " + limit + ": " + width);
    }
}
