import javax.sql.rowset.serial.SerialDatalink;

public class SerialDatalink_3 {
    public static void main(String[] args) {
        SerialDatalink datalink1 = new SerialDatalink("https://example.com");
        SerialDatalink datalink2 = new SerialDatalink("https://example.com");

        boolean isEqual = datalink1.equals(datalink2);
        System.out.println("Are the SerialDatalinks equal? " + isEqual);
    }
}
