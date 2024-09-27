import javax.sql.rowset.serial.SerialJavaObject;

public class SerialJavaObject_5 {
    public static void main(String[] args) {
        SerialJavaObject obj1 = new SerialJavaObject();
        SerialJavaObject obj2 = new SerialJavaObject();
        
        boolean result1 = obj1.equals(obj2);
        System.out.println("Result 1: " + result1); // Output: Result 1: true
        
        SerialJavaObject obj3 = obj1;
        boolean result2 = obj1.equals(obj3);
        System.out.println("Result 2: " + result2); // Output: Result 2: true
    }
}
