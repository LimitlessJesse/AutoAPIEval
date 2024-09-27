public class StringBuilder_3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        
        System.out.println("Before delete: " + sb);
        
        sb.delete(6, 11);
        
        System.out.println("After delete: " + sb);
    }
}
