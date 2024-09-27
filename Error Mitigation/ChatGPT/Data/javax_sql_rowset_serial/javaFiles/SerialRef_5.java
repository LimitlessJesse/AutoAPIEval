import javax.sql.rowset.serial.SerialRef;

public class SerialRef_5 {
    public static void main(String[] args) {
        SerialRef ref1 = new SerialRef();
        SerialRef ref2 = new SerialRef();
        
        boolean result1 = ref1.equals(ref2);
        System.out.println("Result 1: " + result1); // Output: Result 1: true
        
        SerialRef ref3 = ref1;
        boolean result2 = ref1.equals(ref3);
        System.out.println("Result 2: " + result2); // Output: Result 2: true
    }
}
