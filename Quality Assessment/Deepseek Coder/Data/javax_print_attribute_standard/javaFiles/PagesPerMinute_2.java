import javax.print.attribute.standard.PagesPerMinute;

public class PagesPerMinute_2 {
    public static void main(String[] args) {
        PagesPerMinute pp1 = new PagesPerMinute(10);
        PagesPerMinute pp2 = new PagesPerMinute(10);

        boolean isEqual = pp1.equals(pp2);

        System.out.println("Are the two PagesPerMinute objects equal? " + isEqual);
    }
}
