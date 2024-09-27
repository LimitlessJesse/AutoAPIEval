import java.util.GregorianCalendar;

public class GregorianCalendar_5 {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        
        // Get the actual maximum value of the given field
        int actualMaxYear = cal.getActualMaximum(GregorianCalendar.YEAR);
        int actualMaxWeek = cal.getActualMaximum(GregorianCalendar.WEEK_OF_YEAR);
        
        System.out.println("Actual Maximum Year: " + actualMaxYear);
        System.out.println("Actual Maximum Week of Year: " + actualMaxWeek);
    }
}
