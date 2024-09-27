public class Object_5 {
    public static void main(String[] args) {
        Object obj = new Object();
        
        synchronized(obj) {
            obj.notify();
        }
    }
}
