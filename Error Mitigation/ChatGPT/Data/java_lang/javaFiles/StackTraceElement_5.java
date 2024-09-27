public class StackTraceElement_5 {
    public static void main(String[] args) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        
        for (StackTraceElement element : stackTrace) {
            System.out.println("Method: " + element.getMethodName());
            System.out.println("Is Native Method: " + element.isNativeMethod());
        }
    }
}
