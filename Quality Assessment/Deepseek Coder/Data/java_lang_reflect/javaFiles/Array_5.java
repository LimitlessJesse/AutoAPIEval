import java.lang.reflect.Array;

public class Array_5 {
    public static void main(String[] args) {
        boolean[] boolArray = new boolean[3];
        Array.setBoolean(boolArray, 0, true);
        Array.setBoolean(boolArray, 1, false);
        Array.setBoolean(boolArray, 2, true);

        boolean boolValue = Array.getBoolean(boolArray, 1);
        System.out.println(boolValue);  // Output: false
    }
}
