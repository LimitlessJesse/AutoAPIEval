import javax.sql.rowset.serial.SerialRef;

public class SerialRef_4 {
    public static void main(String[] args) {
        SerialRef serialRef = new SerialRef(new Object());
        int hashCode = serialRef.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
