import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

public class Duration_1 {
    public static void main(String[] args) {
        try {
            DatatypeFactory factory = DatatypeFactory.newInstance();
            Duration duration1 = factory.newDuration(true, 0, 1, 0, 0, 0, 0);
            Duration duration2 = factory.newDuration(true, 0, 0, 1, 0, 0, 0);

            Duration result = duration1.add(duration2);
            System.out.println("Result: " + result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
