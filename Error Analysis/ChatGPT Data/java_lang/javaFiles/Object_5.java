public class Object_5 {
    public static void main(String[] args) {
        // Create an object
        Object obj = new Object();
        
        // Notify the object
        synchronized(obj) {
            obj.notify();
        }
    }
}
