public class Throwable_5 {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("Null Pointer Exception");
        } catch (Exception e) {
            Throwable throwable = new IllegalArgumentException("Illegal Argument Exception");
            throwable.addSuppressed(e);
            System.out.println("Suppressed exception: " + throwable.getSuppressed()[0]);
        }
    }
}
