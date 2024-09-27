public class StackTraceElement_2 {
    public static void main(String[] args) {
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        for (StackTraceElement element : stackTrace) {
            System.out.println("File Name: " + element.getFileName());
        }
    }
}
