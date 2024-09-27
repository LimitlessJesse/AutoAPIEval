import javax.print.attribute.standard.DateTimeAtCreation;

public class DateTimeAtCreation_3 {
    public static void main(String[] args) {
        DateTimeAtCreation dateTime1 = new DateTimeAtCreation(2022, 10, 20, 15, 30, 0);
        DateTimeAtCreation dateTime2 = new DateTimeAtCreation(2022, 10, 20, 15, 30, 0);

        boolean isEqual = dateTime1.equals(dateTime2);
        System.out.println("Are the two date-time attributes equal? " + isEqual);
    }
}
