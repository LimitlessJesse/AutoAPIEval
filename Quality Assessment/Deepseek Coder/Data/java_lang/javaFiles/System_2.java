import java.lang.System;

public class System_2 {
    public static void main(String[] args) {
        // Create source array
        int srcArray[] = {1, 2, 3, 4, 5};

        // Create destination array
        int destArray[] = new int[srcArray.length];

        // Copy elements from source array to destination array
        System.arraycopy(srcArray, 0, destArray, 0, srcArray.length);

        // Print elements of destination array
        for (int i = 0; i < destArray.length; i++) {
            System.out.println(destArray[i]);
        }
    }
}
