import javax.print.attribute.standard.PagesPerMinuteColor;

public class PagesPerMinuteColor_4 {
    public static void main(String[] args) {
        PagesPerMinuteColor ppmc1 = new PagesPerMinuteColor(10);
        PagesPerMinuteColor ppmc2 = new PagesPerMinuteColor(20);

        boolean isEqual = ppmc1.equals(ppmc2);
        System.out.println("Are the PagesPerMinuteColor objects equal? " + isEqual);
    }
}
