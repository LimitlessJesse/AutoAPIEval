import javax.print.attribute.standard.PagesPerMinuteColor;

public class PagesPerMinuteColor_2 {
    public static void main(String[] args) {
        PagesPerMinuteColor ppm1 = new PagesPerMinuteColor(10);
        PagesPerMinuteColor ppm2 = new PagesPerMinuteColor(10);

        boolean isEqual = ppm1.equals(ppm2);

        System.out.println("Are the two PagesPerMinuteColor objects equal? " + isEqual);
    }
}
