import javax.print.attribute.standard.PagesPerMinute;

public class PagesPerMinute_3 {
    public static void main(String[] args) {
        PagesPerMinute ppm1 = new PagesPerMinute(10);
        PagesPerMinute ppm2 = new PagesPerMinute(10);
        
        System.out.println(ppm1.equals(ppm2)); // Output: true
    }
}
