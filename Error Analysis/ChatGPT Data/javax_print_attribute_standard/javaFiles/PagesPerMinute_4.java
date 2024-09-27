import javax.print.attribute.standard.PagesPerMinute;

public class PagesPerMinute_4 {
    public static void main(String[] args) {
        PagesPerMinute ppm1 = new PagesPerMinute(10);
        PagesPerMinute ppm2 = new PagesPerMinute(10);

        // Using equals() method to compare the two PagesPerMinute objects
        boolean isEqual = ppm1.equals(ppm2);
        System.out.println("Are the PagesPerMinute objects equal? " + isEqual);
    }
}
