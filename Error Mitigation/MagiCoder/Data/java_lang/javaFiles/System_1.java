import java.lang.System;

public class System_1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Your code here...

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
    }
}
