public class StringBuilder_4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.replace(6, 11, "Everyone");
        System.out.println(sb);
    }
}
