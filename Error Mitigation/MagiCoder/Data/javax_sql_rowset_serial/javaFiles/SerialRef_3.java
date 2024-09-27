import javax.sql.rowset.serial.SerialRef;

public class SerialRef_3 {
    public static void main(String[] args) {
        SerialRef ref1 = new SerialRef(new Object());
        SerialRef ref2 = new SerialRef(new Object());
        SerialRef ref3 = ref1;

        System.out.println(ref1.equals(ref2)); // false
        System.out.println(ref1.equals(ref3)); // true
        System.out.println(ref1.equals(new Object())); // false
    }
}
