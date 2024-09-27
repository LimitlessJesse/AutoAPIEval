import javax.print.attribute.standard.PagesPerMinute;

public class PagesPerMinute_3 {
    public static void main(String[] args) {
        PagesPerMinute pp1 = new PagesPerMinute(10);
        PagesPerMinute pp2 = new PagesPerMinute(10);
        PagesPerMinute pp3 = new PagesPerMinute(20);

        System.out.println(pp1.equals(pp2));  // Output: true
        System.out.println(pp1.equals(pp3));  // Output: false
    }
}
