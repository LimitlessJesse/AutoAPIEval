import javax.sql.rowset.serial.SerialJavaObject;

public class SerialJavaObject_4 {
    public static void main(String[] args) {
        SerialJavaObject obj1 = new SerialJavaObject();
        SerialJavaObject obj2 = new SerialJavaObject();

        // Testing the equals method
        System.out.println(obj1.equals(obj2));
    }
}
