import java.time.Period;

public class Period_2 {
    public static void main(String[] args) {
        CharSequence text = "P1Y2M3D";
        Period period = Period.parse(text);
        
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }
}
