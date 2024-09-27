import javax.sql.rowset.serial.SerialRef;

public class SerialRef_2 {
    public static void main(String[] args) {
        SerialRef ref = new SerialRef(null, null); // Create a SerialRef object
        Object obj = ref.getObject(); // Get the object from the SerialRef
        System.out.println(obj); // Print the object
    }
}
