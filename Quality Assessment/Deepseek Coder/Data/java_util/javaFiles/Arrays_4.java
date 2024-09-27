import java.util.Arrays;

public class Arrays_4 {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        Integer[] array3 = {1, 2, 4};

        boolean result1 = Arrays.equals(array1, array2);
        boolean result2 = Arrays.equals(array1, array3);

        System.out.println("Are array1 and array2 equal? " + result1);
        System.out.println("Are array1 and array3 equal? " + result2);
    }
}
