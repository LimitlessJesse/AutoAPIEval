import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_2 {
    public static void main(String[] args) {
        try {
            DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
            Duration duration1 = datatypeFactory.newDuration("P2DT5H30M");
            Duration duration2 = datatypeFactory.newDuration("P1DT3H15M");

            Duration result = duration1.subtract(duration2);
            System.out.println("Subtracted Duration: " + result.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
