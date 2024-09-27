public class StringBuffer_3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Before deletion: " + sb);

        sb.delete(6, 11);
        System.out.println("After deletion: " + sb);
    }
}
