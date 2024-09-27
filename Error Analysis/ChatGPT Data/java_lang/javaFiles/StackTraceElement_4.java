public class StackTraceElement_4 {
    public static void main(String[] args) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        
        for (StackTraceElement element : stackTrace) {
            String fileName = element.getFileName();
            System.out.println("File name: " + fileName);
        }
    }
}
