import java.lang.reflect.Array;

public class Array_1 {
    public static void main(String[] args) {
        try {
            int[] newArray = (int[]) Array.newInstance(int.class, 5);
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = i * 10;
            }
            for (int value : newArray) {
                System.out.println(value);
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("Negative array size exception occurred");
        } catch (NullPointerException e) {
            System.out.println("Component type is null");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid component type or exceeding dimensions limit");
        }
    }
}
