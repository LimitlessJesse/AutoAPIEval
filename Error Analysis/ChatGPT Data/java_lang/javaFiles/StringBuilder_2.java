public class StringBuilder_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        sb.insert(6, "Java ");
        System.out.println(sb.toString()); // Output: Hello Java World
    }
}
