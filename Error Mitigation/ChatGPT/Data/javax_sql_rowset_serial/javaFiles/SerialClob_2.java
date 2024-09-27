import javax.sql.rowset.serial.SerialClob;
import javax.sql.rowset.serial.SerialException;

public class SerialClob_2 {
    public static void main(String[] args) {
        try {
            char[] charArray = {'H', 'e', 'l', 'l', 'o'};
            SerialClob serialClob = new SerialClob(charArray);
            long length = serialClob.length();
            System.out.println("Length of SerialClob: " + length);
        } catch (SerialException e) {
            e.printStackTrace();
        }
    }
}
