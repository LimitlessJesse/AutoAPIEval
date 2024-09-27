import javax.sql.rowset.serial.SerialDatalink;

public class SerialDatalink_5 {
    public static void main(String[] args) {
        SerialDatalink dataLink1 = new SerialDatalink("https://example.com");
        SerialDatalink dataLink2 = new SerialDatalink("https://example.com");
        
        boolean isEqual = dataLink1.equals(dataLink2);
        System.out.println("Are the two datalinks equal? " + isEqual);
    }
}
