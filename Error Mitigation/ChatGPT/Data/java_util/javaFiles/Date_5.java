import java.util.Date;

public class Date_5 {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        
        int comparison = date1.compareTo(date2);
        
        if(comparison == 0) {
            System.out.println("Dates are equal");
        } else if(comparison < 0) {
            System.out.println("Date 1 is before Date 2");
        } else {
            System.out.println("Date 1 is after Date 2");
        }
    }
}
