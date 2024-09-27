import javax.print.attribute.standard.PagesPerMinuteColor;

public class PagesPerMinuteColor_3 {
    public static void main(String[] args) {
        PagesPerMinuteColor ppm1 = new PagesPerMinuteColor(10);
        PagesPerMinuteColor ppm2 = new PagesPerMinuteColor(10);
        
        System.out.println(ppm1.equals(ppm2)); // Output: true
    }
}
