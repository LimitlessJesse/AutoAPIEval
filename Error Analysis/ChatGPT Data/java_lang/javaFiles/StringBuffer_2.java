public class StringBuffer_2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Before setCharAt: " + sb); // Before modification
        sb.setCharAt(1, 'a'); // changing the character at index 1 to 'a'
        System.out.println("After setCharAt: " + sb); // After modification
    }
}
