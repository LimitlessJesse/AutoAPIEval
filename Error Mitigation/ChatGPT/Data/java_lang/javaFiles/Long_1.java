import java.lang.Long;

public class Long_1 {
    public static void main(String[] args) {
        Long long1 = new Long(10);
        Long long2 = new Long(5);
        
        int result = long1.compareTo(long2);
        
        System.out.println("Comparison result: " + result);
    }
}
